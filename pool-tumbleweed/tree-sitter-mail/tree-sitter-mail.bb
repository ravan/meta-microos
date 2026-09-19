SUMMARY = "Mail grammar for tree-sitter"
DESCRIPTION = "Mail grammar for tree-sitter."
LICENSE = "MIT"

PV = "0+20260308.5eddbfd"

RPM_NAME = "tree-sitter-mail-0+20260308.5eddbfd-1.3.aarch64.rpm"
RPM_HASH = "f75d87c9d62e7ca583d99bc318a89e9a739a7fa196a7fb5d8bbac039d0a6cb33f7fda6175977253a77499030280bbe6bbd9ab77685fa33cbff51bb8c87427d2c"

RPROVIDES:${PN} += "libtree-sitter-mail.so \
tree-sitter-mail \
treesitter-grammar-tree-sitter-mail"

RDEPENDS:${PN} += ""

inherit rpm
