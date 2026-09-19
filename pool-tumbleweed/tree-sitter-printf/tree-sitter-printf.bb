SUMMARY = "Printf format grammar for tree-sitter"
DESCRIPTION = "Printf format grammar for tree-sitter."
LICENSE = "ISC"

PV = "0.5.0"

RPM_NAME = "tree-sitter-printf-0.5.0-2.4.aarch64.rpm"
RPM_HASH = "080ac5b32a62451a9678670855c19ba3c7576838ad158f65838100fc185b45060aaf264356149036903fa73d2c95a5e4be7d10b595213887539516097573ece0"

RPROVIDES:${PN} += "libtree-sitter-printf.so \
tree-sitter-printf \
treesitter-grammar-tree-sitter-printf"

RDEPENDS:${PN} += ""

inherit rpm
