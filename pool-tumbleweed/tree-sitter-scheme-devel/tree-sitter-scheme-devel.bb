SUMMARY = "Devel package for tree-sitter-scheme containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.24.7.1"

RPM_NAME = "tree-sitter-scheme-devel-0.24.7.1-1.3.noarch.rpm"
RPM_HASH = "fe5cfba2ae04d50dd077d847a754ad0e1efe87c813647e06a5bdadeb37d6c20c263f7dfd8de2e3e3979da26c4f1180683f68895f93d1501fb5bc6331030b46c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-scheme-devel \
treesitter-grammar-src-tree-sitter-scheme"

RDEPENDS:${PN} += ""

inherit rpm
