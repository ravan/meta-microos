SUMMARY = "Python binding for the tree-sitter-typescript grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-typescript grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.2"

RPM_NAME = "python313-tree-sitter-typescript-0.23.2-3.1.aarch64.rpm"
RPM_HASH = "38d63cfa994ea75ebb8d86653084ccc773468c9b2db48c1d16a5ea5ff978d7070a6cd66ac54488945ca00629626094af64c0befd0bacb241acd37dbab44117d2"

RPROVIDES:${PN} += "python3-tree-sitter-typescript \
python313-tree-sitter-typescript"

RDEPENDS:${PN} += "python-abi"

inherit rpm
