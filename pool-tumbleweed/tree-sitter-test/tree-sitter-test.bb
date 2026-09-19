SUMMARY = "TS corpus test grammar for tree-sitter"
DESCRIPTION = "TS corpus test grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "tree-sitter-test-0.3.0-2.4.aarch64.rpm"
RPM_HASH = "b60548e01a68e48864c05e7212c15affa180a29e29652b7e33167056daf3840c3afdd51b297b29d7a0d3cd4cedf791231663ad6a525863d2a05f8ffca349d7db"

RPROVIDES:${PN} += "libtree-sitter-test.so \
tree-sitter-test \
treesitter-grammar-tree-sitter-test"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
