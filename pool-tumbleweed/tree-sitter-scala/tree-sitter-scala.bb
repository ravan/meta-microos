SUMMARY = "Scala grammar for tree-sitter"
DESCRIPTION = "Python binding for the scala tree-sitter grammar."
LICENSE = "MIT"

PV = "0.26.0"

RPM_NAME = "tree-sitter-scala-0.26.0-1.1.aarch64.rpm"
RPM_HASH = "b0c131278e69d3b00fb20f8245e148458c68683d81b328b0ffd0b059b813146f4cca9a1242b992bb30dfe21ad697e3653aae1e1d1d2cdce96c7dd1d7f9b50b93"

RPROVIDES:${PN} += "libtree-sitter-scala.so \
tree-sitter-scala \
treesitter-grammar-tree-sitter-scala"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
