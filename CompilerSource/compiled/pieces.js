export default {
  first_player: 0,
  width: 20,
  height: 20,
  coloring: (x, y, last_color) => {
    if (y === 0) last_color = last_color === "#ffffff" ? "#c90" : "#ffffff"
    last_color = last_color === "#ffffff" ? "#c90" : "#ffffff"
    return last_color
  },
  player_change: (context) => {
    context.current_player = context.current_player === 0 ? 1 : 0
  },
}