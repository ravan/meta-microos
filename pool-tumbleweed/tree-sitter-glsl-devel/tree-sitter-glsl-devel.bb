SUMMARY = "Devel package for tree-sitter-glsl containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "tree-sitter-glsl-devel-0.2.0-2.4.noarch.rpm"
RPM_HASH = "2ad91582688dbb7f668ed773975228a1b4172da67e43e2dcc6a1d4c373898e88987ff8b544711cca6c703e1fce2e0cb51d9838f3cfc5b580934771573bddd8b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-glsl-devel \
treesitter-grammar-src-tree-sitter-glsl"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-c"

inherit rpm
