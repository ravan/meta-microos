SUMMARY = "YAML grammar for tree-sitter"
DESCRIPTION = "YAML grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "tree-sitter-yaml-0.7.2-2.4.aarch64.rpm"
RPM_HASH = "94d0f82af1cf2df64b72caf301652191e3906cb1079ee5c8442ddace9812fce035a191c6ddd10ee2cf58cf3580a553ddd8279a0ab9b4a2ab6d4f8714b6bb63ad"

RPROVIDES:${PN} += "libtree-sitter-yaml.so \
tree-sitter-yaml \
treesitter-grammar-tree-sitter-yaml"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
