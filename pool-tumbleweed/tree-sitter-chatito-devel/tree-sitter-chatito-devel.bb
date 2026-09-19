SUMMARY = "Devel package for tree-sitter-chatito containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "tree-sitter-chatito-devel-0.5.0-2.4.noarch.rpm"
RPM_HASH = "763299f02a1f232f671a5d80b45b8149fb09f6fa2e6c3114ae4a05b035d903aa62c9266561ed4ef24b2d9b201fad1f12f9b443a487133e2b7592cc9fbba361d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-chatito-devel \
treesitter-grammar-src-tree-sitter-chatito"

RDEPENDS:${PN} += ""

inherit rpm
