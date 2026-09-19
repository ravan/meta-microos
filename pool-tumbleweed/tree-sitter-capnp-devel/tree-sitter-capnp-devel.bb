SUMMARY = "Devel package for tree-sitter-capnp containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "tree-sitter-capnp-devel-1.5.0-2.4.noarch.rpm"
RPM_HASH = "416345c0cf7a5d775461b73ec3e3c15ef56a2b2907ca4c81c1261e582830a9238fd1f59055f1f04ed9e62298565a5e454f2351d5abf8e3508fd0e3f814db87aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-capnp-devel \
treesitter-grammar-src-tree-sitter-capnp"

RDEPENDS:${PN} += ""

inherit rpm
