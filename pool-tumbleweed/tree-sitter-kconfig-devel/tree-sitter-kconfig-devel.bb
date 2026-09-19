SUMMARY = "Devel package for tree-sitter-kconfig containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "tree-sitter-kconfig-devel-1.3.0-2.4.noarch.rpm"
RPM_HASH = "055c8a58117e1c6492ef922a14a865e8286a26a4de7fffaa67661c8981692248e0801de8d769ebbcfc915bd5f3592c4335fee4c7b476575ab56f37d06933c587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-kconfig-devel \
treesitter-grammar-src-tree-sitter-kconfig"

RDEPENDS:${PN} += ""

inherit rpm
