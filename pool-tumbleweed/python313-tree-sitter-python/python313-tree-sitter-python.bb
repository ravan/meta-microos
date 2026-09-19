SUMMARY = "Python binding for the python tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_python that loads the grammar library \
shipped in tree-sitter-python and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.23.6"

RPM_NAME = "python313-tree-sitter-python-0.23.6-3.1.aarch64.rpm"
RPM_HASH = "3ecbce92e492dde84bbb113b336d9828c9701683dba264a227fb81acd8e73009cb0e5356037107ad766bbe71a92402f07f332799765b6bf9e7fb40ebbefda308"

RPROVIDES:${PN} += "python3-tree-sitter-python \
python313-tree-sitter-python"

RDEPENDS:${PN} += "python-abi \
tree-sitter-python"

inherit rpm
