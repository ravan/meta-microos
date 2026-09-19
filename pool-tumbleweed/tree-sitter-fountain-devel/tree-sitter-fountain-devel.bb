SUMMARY = "Devel package for tree-sitter-fountain containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0+git.1717700979.7b38a94"

RPM_NAME = "tree-sitter-fountain-devel-0+git.1717700979.7b38a94-2.4.noarch.rpm"
RPM_HASH = "b7d69421a2deec98f1ed215b5d26c74b136f9cd1c64fe09aa95ac351c8a93f2ad3b97d3ec8363540bdeb07675dc9e81553f2b56c70ed5852a65d40b527f3a5b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-fountain-devel \
treesitter-grammar-src-tree-sitter-fountain"

RDEPENDS:${PN} += ""

inherit rpm
