
import renderer from "./renderer.js";
const { generate_table, render } = renderer
import initial_status from "./initial_status.js";
import gameLogic from "./gameLogic.js";
import rules from "./rules.js"
const { create_context_from_initial_status_and_rules } = gameLogic
const context = create_context_from_initial_status_and_rules(initial_status, rules)

let table = generate_table("board", rules.height, rules.width);

render(context, table)
import("./abdl.js")
  .then(module => {
    module.default.main(context, table, renderer.render)
    context.on_move = module.default.on_move;
  })
  .catch((e) => console.log("No plugin detected"))