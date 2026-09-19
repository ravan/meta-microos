SUMMARY = "Bevy grammar for tree-sitter"
DESCRIPTION = "Bevy grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "tree-sitter-wgsl-bevy-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "88e4c423b6faf03a411691c15965eb173f28a5c3c59ae044f4023cb66db427351b5b8934b2e0e0cf15e9c937354d01db795acda0f11fee66f1266d8d5f6ddbac"

RPROVIDES:${PN} += "libtree-sitter-wgsl-bevy.so \
tree-sitter-wgsl-bevy \
treesitter-grammar-tree-sitter-wgsl-bevy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
