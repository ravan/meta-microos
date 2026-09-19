SUMMARY = "Devel package for tree-sitter-clojure containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "CC0-1.0"

PV = "0.0.12"

RPM_NAME = "tree-sitter-clojure-devel-0.0.12-2.4.noarch.rpm"
RPM_HASH = "ef5c6ca061c31b172eaf98c8c81bdc6af3a8afb6d31661e4680dd0973d70a83e5722e55c71e9a5baaa09741689b2f5865111afdcef6adf8bece4a5f5bfc7efd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-clojure-devel \
treesitter-grammar-src-tree-sitter-clojure"

RDEPENDS:${PN} += ""

inherit rpm
