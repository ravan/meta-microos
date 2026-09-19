SUMMARY = "Swift grammar for tree-sitter"
DESCRIPTION = "Python binding for the swift tree-sitter grammar."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "tree-sitter-swift-0.7.3-1.1.aarch64.rpm"
RPM_HASH = "c7a1b91a4f40e877172854b943d54d57f702a66c37978927c5677fd854b9e5585c2ba93a91441e833cce5846a5ba12650284569618b47f075e177fadecb267f8"

RPROVIDES:${PN} += "libtree-sitter-swift.so \
tree-sitter-swift \
treesitter-grammar-tree-sitter-swift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
