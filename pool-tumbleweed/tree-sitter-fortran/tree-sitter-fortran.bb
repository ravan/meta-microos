SUMMARY = "Fortran grammar for tree-sitter"
DESCRIPTION = "Python binding for the fortran tree-sitter grammar."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "tree-sitter-fortran-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "245cc5ba019958d2c756923e52f6025e23be6e012f11656d93f87bee90bff77f4161b56d753ce2a63b0908ff72fc59ee96853dad402b2eae73bdd7fb0402673a"

RPROVIDES:${PN} += "libtree-sitter-fortran.so \
tree-sitter-fortran \
treesitter-grammar-tree-sitter-fortran"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
