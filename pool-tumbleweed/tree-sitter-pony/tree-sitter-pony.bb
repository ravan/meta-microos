SUMMARY = "Pony grammar for tree-sitter"
DESCRIPTION = "Pony grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-pony-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "5bba08c56c4e2e0c85952578529ed8199aee8d8615cf327a7e2bef3655bee52b930e6f0f9b2d25f10b4752a73bc99637c926954cd70156d05f1152d385324b37"

RPROVIDES:${PN} += "libtree-sitter-pony.so \
tree-sitter-pony \
treesitter-grammar-tree-sitter-pony"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
