SUMMARY = "RON grammar for tree-sitter"
DESCRIPTION = "RON grammar for tree-sitter."
LICENSE = "Apache-2.0 | MIT"

PV = "0.2.0"

RPM_NAME = "tree-sitter-ron-0.2.0-2.4.aarch64.rpm"
RPM_HASH = "a3780f6618963f5384d5366a91d1281ed295f100df4868ab3c81a63b4e6e16d087511ffcc3b7f2f9f635a30baf7a979818d04e23b93e6abaa8213e8c043254f0"

RPROVIDES:${PN} += "libtree-sitter-ron.so \
tree-sitter-ron \
treesitter-grammar-tree-sitter-ron"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
