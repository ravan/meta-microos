SUMMARY = "Devel package for tree-sitter-ungrammar containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0+20230227.debd26f"

RPM_NAME = "tree-sitter-ungrammar-devel-0+20230227.debd26f-2.4.noarch.rpm"
RPM_HASH = "39aa9587b8380e5f4d9b466f086d295947b8bf5e3f5f62d918f7b51703a824480d663c3c9abc9b38b2ae93c589505309f71a2486f1e7e9cb0c8014caaf5cba67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-ungrammar-devel \
treesitter-grammar-src-tree-sitter-ungrammar"

RDEPENDS:${PN} += ""

inherit rpm
