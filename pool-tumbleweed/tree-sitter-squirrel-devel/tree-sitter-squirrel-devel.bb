SUMMARY = "Devel package for tree-sitter-squirrel containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-squirrel-devel-1.0.0-2.4.noarch.rpm"
RPM_HASH = "6f7a112f7ee46ba0092d0cf6739df5796197ce071da0b82a026c2e1067ac8a243666a0dadb8fe0208ece48d07d28e0525acbdbb36558e4f49898506756affd61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-squirrel-devel \
treesitter-grammar-src-tree-sitter-squirrel"

RDEPENDS:${PN} += ""

inherit rpm
