SUMMARY = "Devel package for tree-sitter-json containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.24.8"

RPM_NAME = "tree-sitter-json-devel-0.24.8-3.1.noarch.rpm"
RPM_HASH = "4649a05a6b4b0911b6a1b5193df3665f24f95a5c29086847d473f47c2f8fcf8ee1f16a131463bd07e873681af783cba14a89b24ac644cf954f905ad358c7b94d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-json-devel \
treesitter-grammar-src-tree-sitter-json"

RDEPENDS:${PN} += ""

inherit rpm
