SUMMARY = "Python binding for the php tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_php that loads the grammar \
libraries shipped in tree-sitter-php and exposes them to python-tree-sitter \
via language_php() and language_php_only()."
LICENSE = "MIT"

PV = "0.23.9"

RPM_NAME = "python314-tree-sitter-php-0.23.9-1.1.aarch64.rpm"
RPM_HASH = "c1b75b282e8f338d99c4c7f1b9bf03827722032fd3abd24df2f44d4e24ec7e3ac04d2277338d598f9f79641aae8bcb88b115798323b37d583401df2dfa32dd68"

RPROVIDES:${PN} += "python314-tree-sitter-php"

RDEPENDS:${PN} += "python-abi \
tree-sitter-php"

inherit rpm
