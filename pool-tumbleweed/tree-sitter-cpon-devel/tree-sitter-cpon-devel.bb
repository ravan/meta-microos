SUMMARY = "Devel package for tree-sitter-cpon containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-cpon-devel-1.0.0-2.4.noarch.rpm"
RPM_HASH = "d292e6b9e055e8d0f258ca05853bee8fa02b1b95481cf5f31a3138cb4e00589fe347f1919a4799ba60bddf2240c865d97fe43ff4192beb103c41b7b401cccf8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-cpon-devel \
treesitter-grammar-src-tree-sitter-cpon"

RDEPENDS:${PN} += ""

inherit rpm
