SUMMARY = "Bicep grammar for tree-sitter"
DESCRIPTION = "Bicep grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-bicep-1.1.0-2.4.aarch64.rpm"
RPM_HASH = "f2da45dd4c5c0989c915d6261d317ddad781bb6da64694075670ad535c086bddb082fa0c41526b4317d8c48f2be3d07279cc18822721825efe3080d08a691c32"

RPROVIDES:${PN} += "libtree-sitter-bicep.so \
tree-sitter-bicep \
treesitter-grammar-tree-sitter-bicep"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
