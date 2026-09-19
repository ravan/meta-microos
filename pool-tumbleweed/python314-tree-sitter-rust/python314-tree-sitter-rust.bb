SUMMARY = "Python binding for the tree-sitter-rust grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-rust grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "python314-tree-sitter-rust-0.24.0-3.1.aarch64.rpm"
RPM_HASH = "c0a16e29892a3b9bee0645f7907ee5064acfde4835d8793cb6d59f7f12433a5a68a2a366f1564b8729ba8a61ed9ee7d2f284145f31ecb26dfa2023f800a8b9e0"

RPROVIDES:${PN} += "python314-tree-sitter-rust"

RDEPENDS:${PN} += "python-abi"

inherit rpm
