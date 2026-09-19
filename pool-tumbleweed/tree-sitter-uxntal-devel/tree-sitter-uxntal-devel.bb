SUMMARY = "Devel package for tree-sitter-uxntal containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-uxntal-devel-1.0.0-2.4.noarch.rpm"
RPM_HASH = "fa9d67d5e6f9e56e1613bbfc4e4918df47c3f57c55696aa60cb578ee20832f656b2116a0b5c5b24dc8ea897952d035908854978fd082668b4a7b6c799d6fcb2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-uxntal-devel \
treesitter-grammar-src-tree-sitter-uxntal"

RDEPENDS:${PN} += ""

inherit rpm
