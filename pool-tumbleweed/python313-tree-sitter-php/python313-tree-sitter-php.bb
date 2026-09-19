SUMMARY = "Python binding for the php tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_php that loads the grammar \
libraries shipped in tree-sitter-php and exposes them to python-tree-sitter \
via language_php() and language_php_only()."
LICENSE = "MIT"

PV = "0.23.9"

RPM_NAME = "python313-tree-sitter-php-0.23.9-1.1.aarch64.rpm"
RPM_HASH = "1dce537cf8f8de8436486b047705521f8197f86eb9e13c220584e23d6be00ad8ce9649f2219a44ec17fabf0bb5c72130c955a1c53be500ae63324f4c7afea11d"

RPROVIDES:${PN} += "python3-tree-sitter-php \
python313-tree-sitter-php"

RDEPENDS:${PN} += "python-abi \
tree-sitter-php"

inherit rpm
