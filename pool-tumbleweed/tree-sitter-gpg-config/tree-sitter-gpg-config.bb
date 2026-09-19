SUMMARY = "GPG config grammar for tree-sitter"
DESCRIPTION = "GPG config grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "tree-sitter-gpg-config-0.2.1-2.4.aarch64.rpm"
RPM_HASH = "d06fde2765c4ce29c2b9f4d37bab24309f05788f9e062bf1fee969a1ca84a58a461e3d3e5d52937f88901c84d36eed537d59b2463ba9873d9c67f78903ab6dc3"

RPROVIDES:${PN} += "libtree-sitter-gpg-config.so \
tree-sitter-gpg-config \
treesitter-grammar-tree-sitter-gpg-config"

RDEPENDS:${PN} += ""

inherit rpm
