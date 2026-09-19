SUMMARY = "Devel package for tree-sitter-ron containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "Apache-2.0 | MIT"

PV = "0.2.0"

RPM_NAME = "tree-sitter-ron-devel-0.2.0-2.4.noarch.rpm"
RPM_HASH = "a503c238552b8933536b88d375c207c6de233d16ccbeca9b8dea73c924401865a07c61eba22ed940654623ff0d3949169345328aac6a730185a75fb55e781327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-ron-devel \
treesitter-grammar-src-tree-sitter-ron"

RDEPENDS:${PN} += ""

inherit rpm
