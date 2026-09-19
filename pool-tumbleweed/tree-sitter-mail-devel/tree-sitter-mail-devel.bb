SUMMARY = "Devel package for tree-sitter-mail containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0+20260308.5eddbfd"

RPM_NAME = "tree-sitter-mail-devel-0+20260308.5eddbfd-1.3.noarch.rpm"
RPM_HASH = "279c9f1748f2d83e89fb5970025734573319c972a8f6da85950a8e6223e273dbfec0e81aa74d2ebfd6c26a3bfc7e39c24e90a15a1df45dfd6c18f35c63b5a375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-mail-devel \
treesitter-grammar-src-tree-sitter-mail"

RDEPENDS:${PN} += ""

inherit rpm
