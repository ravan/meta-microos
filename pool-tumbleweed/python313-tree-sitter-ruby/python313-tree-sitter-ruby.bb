SUMMARY = "Python binding for the tree-sitter-ruby grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-ruby grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "python313-tree-sitter-ruby-0.23.1-5.1.aarch64.rpm"
RPM_HASH = "2a4b8a78d3f072eb15e34073911df76a59839d1acd9db6e0f760ec5cfdd9cbd2dd694ce35ac31ef274d2c3f0cf030bcd5d4bf88609aad1f74f334b40c85280d9"

RPROVIDES:${PN} += "python3-tree-sitter-ruby \
python313-tree-sitter-ruby"

RDEPENDS:${PN} += "python-abi"

inherit rpm
