SUMMARY = "CPON grammar for tree-sitter"
DESCRIPTION = "CPON grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-cpon-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "180a37fcdb8e87246bbd67a5f8da99cc1ed26c21ec68a4b0ee39aeb132f25c6e0f854f186b90e6d806aed49f83e2838b76ed39522c5a7246af1ca17b9a0fc751"

RPROVIDES:${PN} += "libtree-sitter-cpon.so \
tree-sitter-cpon \
treesitter-grammar-tree-sitter-cpon"

RDEPENDS:${PN} += ""

inherit rpm
