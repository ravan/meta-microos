SUMMARY = "Devel package for tree-sitter-thrift containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "tree-sitter-thrift-devel-0.5.0-2.4.noarch.rpm"
RPM_HASH = "f5ad09847e21fe8f2771a2a86ada49251c58266192126f4a2040874b8eb48820e0218394c17e64876eefb306e1f8bc5a526ee4f320d8bb13bfa483cd62681186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-thrift-devel \
treesitter-grammar-src-tree-sitter-thrift"

RDEPENDS:${PN} += ""

inherit rpm
