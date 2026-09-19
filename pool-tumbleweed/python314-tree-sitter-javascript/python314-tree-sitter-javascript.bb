SUMMARY = "Python binding for the tree-sitter-javascript grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-javascript grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "python314-tree-sitter-javascript-0.23.1-4.1.aarch64.rpm"
RPM_HASH = "9da368372b8b0aee4d2af84aed7b85753a5c5419a480c1620cd7ef0e9914dabbe5c883abbec4a630028ced6cab892166ebae56e8c22ea00eaf61fdf5c2b971bc"

RPROVIDES:${PN} += "python314-tree-sitter-javascript"

RDEPENDS:${PN} += "python-abi"

inherit rpm
