SUMMARY = "Python binding for the fortran tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_fortran that loads the grammar library \
shipped in tree-sitter-fortran and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-tree-sitter-fortran-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "dd8162a7262ce99f096351643cbb0accd497d5e273a922449b2b34391aaa8e9b86bda07ad2cc5349005985dcc8eba3d6de2ceaa0de518d98ea661cecbe26ad49"

RPROVIDES:${PN} += "python314-tree-sitter-fortran"

RDEPENDS:${PN} += "python-abi \
tree-sitter-fortran"

inherit rpm
