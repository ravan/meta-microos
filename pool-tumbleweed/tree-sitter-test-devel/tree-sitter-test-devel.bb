SUMMARY = "Devel package for tree-sitter-test containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "tree-sitter-test-devel-0.3.0-2.4.noarch.rpm"
RPM_HASH = "5c17604032eebd778d47198f87536867618862db9fd723b521697d8126bfd7ca26f6e42017944dfd16fd1bda326e7883a25f794d16406739ae07caf2bc3ca72b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-test-devel \
treesitter-grammar-src-tree-sitter-test"

RDEPENDS:${PN} += ""

inherit rpm
