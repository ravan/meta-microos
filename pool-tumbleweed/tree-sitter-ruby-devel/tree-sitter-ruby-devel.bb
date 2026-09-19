SUMMARY = "Devel package for tree-sitter-ruby containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "tree-sitter-ruby-devel-0.23.1-5.1.noarch.rpm"
RPM_HASH = "1ee2692806ca9e7e24845569565c86d4eb20b19cef27b2bbef3230ec5eb8fc57315ec037560b8d70ae2343a1bac69a0b054442a71138570711bcf938ceff40df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-ruby-devel \
treesitter-grammar-src-tree-sitter-ruby"

RDEPENDS:${PN} += ""

inherit rpm
