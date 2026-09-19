SUMMARY = "Devel package for tree-sitter-pem containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "tree-sitter-pem-devel-0.1.1-2.4.noarch.rpm"
RPM_HASH = "70505ab01a887c4a763a6657872159632a7bc7fc3cbd00b5f98e1fcad0536f1dea49e0d8b0f2c9d754a1e614da9dcd2034d3a07a00f241a23b76bc9bdd33a0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-pem-devel \
treesitter-grammar-src-tree-sitter-pem"

RDEPENDS:${PN} += ""

inherit rpm
