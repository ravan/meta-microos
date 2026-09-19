SUMMARY = "Python binding for the tree-sitter-c grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-c grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.24.1"

RPM_NAME = "python313-tree-sitter-c-0.24.1-3.1.aarch64.rpm"
RPM_HASH = "e8cbf1530dc8f2111a1769794065bea5f90b872ae8460d971c9d12bba809713ed15e564a9d898f71dd47461efd9576e4330acd1efe5d8dc5da0e4bbf00c32fd3"

RPROVIDES:${PN} += "python3-tree-sitter-c \
python313-tree-sitter-c"

RDEPENDS:${PN} += "python-abi"

inherit rpm
