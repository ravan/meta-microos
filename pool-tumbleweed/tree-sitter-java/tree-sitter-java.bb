SUMMARY = "Java grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-java grammar."
LICENSE = "MIT"

PV = "0.23.5"

RPM_NAME = "tree-sitter-java-0.23.5-3.1.aarch64.rpm"
RPM_HASH = "6cee06df84b3a726e460762a27439f06d6d6747fd208b4d5e926c1eb237e12fd6f6414baf3e690aa2c6351388cf541fd13b3126f70ed44816870e29b9d9e9ab7"

RPROVIDES:${PN} += "libtree-sitter-java.so \
tree-sitter-java \
treesitter-grammar-tree-sitter-java"

RDEPENDS:${PN} += ""

inherit rpm
