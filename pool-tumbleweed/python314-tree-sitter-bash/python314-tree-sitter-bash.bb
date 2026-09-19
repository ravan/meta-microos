SUMMARY = "Python binding for the tree-sitter-bash grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-bash grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "python314-tree-sitter-bash-0.25.1-3.1.aarch64.rpm"
RPM_HASH = "fd87efd194678879024fbb6dd994d71049c4a8f88f18adad1d88e10e4714ed860f52216a309e2b8153aad5290ea11ae6271e04225947abde3b7968b233443b67"

RPROVIDES:${PN} += "python314-tree-sitter-bash"

RDEPENDS:${PN} += "python-abi"

inherit rpm
