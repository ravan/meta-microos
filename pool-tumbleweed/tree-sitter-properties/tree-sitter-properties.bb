SUMMARY = "Java properties grammar for tree-sitter"
DESCRIPTION = "Java properties grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "tree-sitter-properties-0.3.0-2.4.aarch64.rpm"
RPM_HASH = "eacd9c63896db35d67079431c27997153937ad7d4ecb8f77a487ececb0b3d5fda525474096f49e7cb67ec4aa45b525b42e691d8138de7b017c6546e45fb850bd"

RPROVIDES:${PN} += "libtree-sitter-properties.so \
tree-sitter-properties \
treesitter-grammar-tree-sitter-properties"

RDEPENDS:${PN} += ""

inherit rpm
