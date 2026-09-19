SUMMARY = "Devel package for tree-sitter-yaml containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "tree-sitter-yaml-devel-0.7.2-2.4.noarch.rpm"
RPM_HASH = "522bcf18c9b8dc73c1c020dfef7598b60ef807979c16ed8c3ccb5b4fb07f20bdf2b07e2d28d474454b4d44c232e4d134de1314a1953a8d7a6533959ac12cb16b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-yaml-devel \
treesitter-grammar-src-tree-sitter-yaml"

RDEPENDS:${PN} += ""

inherit rpm
