SUMMARY = "Devel package for tree-sitter-regex containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.24.3"

RPM_NAME = "tree-sitter-regex-devel-0.24.3-2.5.noarch.rpm"
RPM_HASH = "d1531c5fe6d06e35d35fe4b764fa69f2c578e36dd45d9e3e132be14e0ec1b86cf5f01081f3828737b606e82ffd430377a0de8447daefdabe3faae1c58468e048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-regex-devel \
treesitter-grammar-src-tree-sitter-regex"

RDEPENDS:${PN} += ""

inherit rpm
