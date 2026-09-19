SUMMARY = "Python binding for the tree-sitter-rust grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-rust grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "python313-tree-sitter-rust-0.24.0-3.1.aarch64.rpm"
RPM_HASH = "7dccc5da00992a3bbb3421c46ceb6bb575e5c242471a5c0b2fecf9419a5627f0f288d955dd68008e3162e6a2f302d4f13923873727404a23426f43fcc9e41420"

RPROVIDES:${PN} += "python3-tree-sitter-rust \
python313-tree-sitter-rust"

RDEPENDS:${PN} += "python-abi"

inherit rpm
