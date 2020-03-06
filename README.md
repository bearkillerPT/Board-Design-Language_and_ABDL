# BDL-Board-Description-Language

## BDL is a board game description language

## Syntax

All bdl files must have 5 sections describing:

**Main rules:**

``` bdl
rules{
  first_player : 0
  width : 8
  height : 8
  coloring : alternate
  player_change : alternate
}
```
| Rule          | Type             |      Required      | Default  |
|---------------|------------------|:------------------:|:--------:|
| first_player  | number (0 or 1)  | :white_check_mark: | &#10060; |
| width         | number (> 0)     | :white_check_mark: | &#10060; |
| height        | number (> 0)     | :white_check_mark: | &#10060; |
| coloring      | enum (alternate) | :white_check_mark: | &#10060; |
| player_change | enum (alternate) | :white_check_mark: | &#10060; |

**Pieces Description:**
```bdl
pieces{
  piece_name1{
    moves{
      x : 2, y : 1
      vertical(3, 7)
    }
    can_jump
  }
  piece_name2{
    moves{
      horizontal(1,)
      diagonal(,), kills : false
    }
  }
```
&#10060;
:white_check_mark:
**Piece Description:**
| Property       | Type                  | Required | Default  | Meaning                                    |
|----------------|-----------------------|:--------:|:--------:|--------------------------------------------|
| moves          | **Move Description**+ | &#10060; | &#10060; | List of piece moves                        |
| can_jump       | bool                  | &#10060; |  false   | Piece capability of jumping over targets   |
| mirrored       | bool                  | &#10060; |  false   | Piece moves depending on owner are flipped |
| on_end_reached | enum (spawn)          | &#10060; |  false   | Piece moves depending on owner are flipped |

on_end_reached spawn takes in any number of arguments and gives the player a chance to spawn another piece when it reaches the end of the board. <br>`on_end_reached: spawn(tower, bishop, queen)`
**Move Description:**
|    Type    | Meaning                                     | Example            |
|:----------:|---------------------------------------------|--------------------|
|  [vector](#asd)    | Can move to particular relative place       | `x : 1, y : 3`     |
| horizontal | Can move horizontally in a rage from a to b | `horizontal(a, b)` |
|  vertical  | Can move vertically in a rage from a to b   | `vertical(a, b)`   |
|  diagonal  | Can move diagonally in a rage from a to b   | `diagonal(a, b)`   |

Empty arguments mean that the piece can move all the way in a particular direction, `vertical(,)` mean that a piece can move vertically all over the board.
Every move can have a property describing it's ability to kill enemies `vertical(,), kills : false`, by default it's set to true.

**Initial Status Description:**
```
initial_status{
  pieces{
    piece_name1{
      positions{
        x : 0, y : 0
      }
      mirrored
    }
    piece_name2{
      positions{
        x : [1, 8], y : 0
      }
    }
  }
}
```
&nbsp;&nbsp;**Piece Placement Description:**


**<a name="asd"></a>vector:**
Chess description file:
```
rules{
  first_player : 0
  width : 8
  height : 8
  coloring : alternate
  player_change : alternate
}
pieces{
  horse{
    moves{
      x : 2, y : 1
      x : 2, y : -1
      x : -2, y : 1
      x : -2, y : -1
      x : 1, y : 2
      x : 1, y : -2
      x : -1, y : 2
      x : -1, y : -2
    }
    can_jump
  }
  tower{
    moves{
      horizontal(,)
      vertical(,)
    }
  }
  bishop{
    moves{
      diagonal(,)
    }
  }
  queen{
    moves{
      horizontal(,)
      vertical(,)
      diagonal(,)
    }
  }
  king{
    moves{
      horizontal(-1,1)
      vertical(-1,1)
      diagonal(-1,1)
    }
  }
  pawn{
    moves{
      vertical(1,2), kills : false
      x : 1, y : 1
      x : -1, y : 1
    }
    on_end_reached: spawn(queen, bishop, tower, horse)
    mirrored
  }
}

initial_status{
  pieces{
    tower{
      positions{
        x : 0, y : 0
        x : 7, y : 0
      }
      mirrored
    }
    horse{
      positions{
        x : 1, y : 0
        x : 6, y : 0
      }
      mirrored
    }
    bishop{
      positions{
        x : 2, y : 0
        x : 5, y : 0
      }
      mirrored
    }
    queen{
      positions{
        x : 3, y : 0
      }
      mirrored
    }
    king{
      positions{
        x : 4, y : 0
      }
      mirrored
    }
    pawn{
      positions{
        x : [0, 7], y : 1
      }
      mirrored
    }
  }
}


invariants{
  cant_risk(king)
  protect_piece(king)
  pawn_movement(pawn)
}

finish{
  no_moves_available
}

```

