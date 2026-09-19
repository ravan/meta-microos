SUMMARY = "OpenSSH config grammar for tree-sitter"
DESCRIPTION = "OpenSSH config grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "tree-sitter-ssh-config-0.4.0-2.4.aarch64.rpm"
RPM_HASH = "87db70886782c536023e0fdc9e51eab0a4af8b6b468e4bf7e065690eab296576feb345a81f4b2ec42d5acc123fdcf386c5e5ef929b414ed0a9dc699ec571ba71"

RPROVIDES:${PN} += "libtree-sitter-ssh-config.so \
tree-sitter-ssh-config \
treesitter-grammar-tree-sitter-ssh-config"

RDEPENDS:${PN} += ""

inherit rpm
