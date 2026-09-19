SUMMARY = "Lua grammar for tree-sitter"
DESCRIPTION = "Lua grammar for tree-sitter."
LICENSE = "MIT"

PV = "0+git.1717700979.7b38a94"

RPM_NAME = "tree-sitter-fountain-0+git.1717700979.7b38a94-2.4.aarch64.rpm"
RPM_HASH = "01b02047ce79df599980d36b84fb074b9d39020e5e78aa366b8285e798cecfff1839a498db8488a84eace95fd173946a01bb49e6c3cd442f62fc7c9ddb113fdf"

RPROVIDES:${PN} += "libtree-sitter-fountain.so \
tree-sitter-fountain \
treesitter-grammar-tree-sitter-fountain"

RDEPENDS:${PN} += ""

inherit rpm
