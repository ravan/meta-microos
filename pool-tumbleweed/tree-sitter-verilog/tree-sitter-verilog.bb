SUMMARY = "Verilog grammar for tree-sitter"
DESCRIPTION = "Python binding for the verilog tree-sitter grammar."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "tree-sitter-verilog-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "9fee12aac3803c06901cef99ce2556f25c4a141b5b76b2ed2148981bf75809a557436837433fed661f0dfea6166fc1d5e0e2a89158b5e3a2607416d18d3b3797"

RPROVIDES:${PN} += "libtree-sitter-verilog.so \
tree-sitter-verilog \
treesitter-grammar-tree-sitter-verilog"

RDEPENDS:${PN} += ""

inherit rpm
