SUMMARY = "Devel package for tree-sitter-c containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.24.1"

RPM_NAME = "tree-sitter-c-devel-0.24.1-3.1.noarch.rpm"
RPM_HASH = "18f949dca9973cc7766e609cae690b92ff056f612ca906d8eed7ba6a217e9948a074e3ff0dff950ddede33eb2eccc2a969b3e51e3bb44e20b19b5d80031b1ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-c-devel \
treesitter-grammar-src-tree-sitter-c"

RDEPENDS:${PN} += ""

inherit rpm
