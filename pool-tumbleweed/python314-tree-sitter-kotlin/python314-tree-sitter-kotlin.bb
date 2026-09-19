SUMMARY = "Python binding for the tree-sitter-kotlin grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-kotlin grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-tree-sitter-kotlin-1.1.0-3.1.aarch64.rpm"
RPM_HASH = "0a671a46e4cec4dd08d1ff1b7ec54826b42009c165181fdd6c4465375dc7c4753dab9f600d4d5533a94125db8d423d894037d2e723460a8d585b16dc554fda22"

RPROVIDES:${PN} += "python314-tree-sitter-kotlin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
