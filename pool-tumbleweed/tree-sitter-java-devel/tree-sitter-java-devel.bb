SUMMARY = "Devel package for tree-sitter-java containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.5"

RPM_NAME = "tree-sitter-java-devel-0.23.5-3.1.noarch.rpm"
RPM_HASH = "99a49e35cea2a0eff51e5542056ff38f6c48cf3b3b501a54ee0e8100a6ee3219fee1810b494492a0735378c6d5d68eacff153fa51b7a50fa7ce5f4f2a6da385b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-java-devel \
treesitter-grammar-src-tree-sitter-java"

RDEPENDS:${PN} += ""

inherit rpm
