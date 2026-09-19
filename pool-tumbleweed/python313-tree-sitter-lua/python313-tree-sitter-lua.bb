SUMMARY = "Python binding for the tree-sitter-lua grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-lua grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-tree-sitter-lua-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "9b27abe2bf1c60c5fb923454d87364c8c45fda12d4fec51fd1dac50d071457875de8086f48736dd70412ba2a1025c03ad9ec0bc2c3a51cf74f572fc7451751e6"

RPROVIDES:${PN} += "python3-tree-sitter-lua \
python313-tree-sitter-lua"

RDEPENDS:${PN} += "python-abi"

inherit rpm
