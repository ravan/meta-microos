SUMMARY = "Python binding for the tree-sitter-cpp grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-cpp grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.4"

RPM_NAME = "python314-tree-sitter-cpp-0.23.4-3.1.aarch64.rpm"
RPM_HASH = "e25e35f41a4e6d49229413b60fe46a17ba61952e11a4544962df19fefe67fc5f86a76c8450b4802445cf4cf2524497b06756f6472e53891f9176808f41fd18dd"

RPROVIDES:${PN} += "python314-tree-sitter-cpp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
