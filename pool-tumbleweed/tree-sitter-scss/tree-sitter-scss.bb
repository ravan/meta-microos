SUMMARY = "SCSS grammar for tree-sitter"
DESCRIPTION = "SCSS grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-scss-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "a0282ce5bf04d68b7c8e465de80295cc800bacea9408273f6050269b0894d9003eb3bcd78112fa272c5d5a5990285e70ffcb4a2441b179c4e9815ec98b1aeb3a"

RPROVIDES:${PN} += "libtree-sitter-scss.so \
tree-sitter-scss \
treesitter-grammar-tree-sitter-scss"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
