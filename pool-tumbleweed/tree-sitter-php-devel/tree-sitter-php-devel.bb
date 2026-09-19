SUMMARY = "Devel package for tree-sitter-php containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.9"

RPM_NAME = "tree-sitter-php-devel-0.23.9-1.1.noarch.rpm"
RPM_HASH = "4f710690447fb26ec0fcb63255e3a604bb5c7665bc3131fd28dce952e5aa9bbd7680f527b724a024fddf8e7c767274f22c53618a4be92c59d301f264d70ccd20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-php-devel \
treesitter-grammar-src-tree-sitter-php"

RDEPENDS:${PN} += ""

inherit rpm
