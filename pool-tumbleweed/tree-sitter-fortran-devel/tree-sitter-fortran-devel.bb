SUMMARY = "Devel package for tree-sitter-fortran containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "tree-sitter-fortran-devel-0.6.0-1.1.noarch.rpm"
RPM_HASH = "60da5d06cbbec83b801cba58bafdfada853342f7ac4525a3bf05a13dc6c4256f94d46e102865fad46630d0ff851037cb08374f48b42f92ccd520e2a70c7da501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-fortran-devel \
treesitter-grammar-src-tree-sitter-fortran"

RDEPENDS:${PN} += ""

inherit rpm
