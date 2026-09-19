SUMMARY = "Python binding for the tree-sitter-go grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-go grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.4"

RPM_NAME = "python314-tree-sitter-go-0.23.4-3.1.aarch64.rpm"
RPM_HASH = "bd3a3860bf92ea76306f4ecfe2dc53088a40ec8d7a708ccb000d9adcef6960f0362fac526b84aa0bf57f4736cb34d0e85b33798d3bd6dedec98c146d74de2c4d"

RPROVIDES:${PN} += "python314-tree-sitter-go"

RDEPENDS:${PN} += "python-abi"

inherit rpm
