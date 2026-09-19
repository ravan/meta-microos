SUMMARY = "Pip requirements grammar for tree-sitter"
DESCRIPTION = "Pip requirements grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "tree-sitter-requirements-0.5.0-2.4.aarch64.rpm"
RPM_HASH = "14a1154a79ff046b69ab850012316900f4c2f7c7a9be8eae07ba80eeedaed3f24b2aedb5894348e0f652a1970b39483ffedfb3062e49b82196ebd1a7e6894313"

RPROVIDES:${PN} += "libtree-sitter-requirements.so \
tree-sitter-requirements \
treesitter-grammar-tree-sitter-requirements"

RDEPENDS:${PN} += ""

inherit rpm
