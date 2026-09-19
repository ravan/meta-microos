SUMMARY = "Devel package for tree-sitter-tablegen containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "tree-sitter-tablegen-devel-0.0.1-2.4.noarch.rpm"
RPM_HASH = "ba1fe5279f55dbb2c0f95146aea798009eefc20a68e9fed58d70950fb730d541dfdf62fd86193fc37aa1a403524312b482dc814c226965c55238a8f19361f25a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-tablegen-devel \
treesitter-grammar-src-tree-sitter-tablegen"

RDEPENDS:${PN} += ""

inherit rpm
