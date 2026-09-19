SUMMARY = "Python binding for the tree-sitter-json grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-json grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.24.8"

RPM_NAME = "python313-tree-sitter-json-0.24.8-3.1.aarch64.rpm"
RPM_HASH = "ed45287a499cd0e730a65c6a9b5d89bd7415aea7fb45ee1d2dbfbe14890ef79caa9c7efb212165b5ac29111fcca8563e0d5589d3d256e84d3b2af0eb7e5c0f69"

RPROVIDES:${PN} += "python3-tree-sitter-json \
python313-tree-sitter-json"

RDEPENDS:${PN} += "python-abi"

inherit rpm
