SUMMARY = "Python binding for the tree-sitter-c-sharp grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-c-sharp grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.5"

RPM_NAME = "python314-tree-sitter-c-sharp-0.23.5-2.1.aarch64.rpm"
RPM_HASH = "6451667dbbcc5edbfd889e39aff81e8f414d5d0cbb67ab6eed01f621a5005ba169598063a0a7aafa782416ed0fc0e5e382cc7d226716a92136077248f044d583"

RPROVIDES:${PN} += "python314-tree-sitter-c-sharp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
