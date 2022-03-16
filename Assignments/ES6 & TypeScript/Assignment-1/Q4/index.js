"use strict";

var arrow = function (names) {
  var out = [];
  for (var _i = 0, names_1 = names; _i < names_1.length; _i++) {
    var color = names_1[_i];
    var row = {};
    row.name = color;
    row.length = color.length;
    out.push(row);
  }
  return out;
};
var names = [
  "Aaaaaaaaa aaaaa",
  "bbbbbbbbb bbbbb",
  "ccccccccc ccccc",
  "ddddddddd ddddd ",
  "eeeeeeeee eeeee ",
];
console.log(arrow(names));

document.write(`<h3>Output: \n${names}</h3>`);
