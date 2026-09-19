SUMMARY = "Devel package for tree-sitter-gpg-config containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "tree-sitter-gpg-config-devel-0.2.1-2.4.noarch.rpm"
RPM_HASH = "493b433d30334e59d4f11211df1026cefafe6c5e3aba9fa3f4d7727479c836f25832b8f900aa98d3134ab25ec31ffcbb9a814459091fc6fdf2f0ef0609ea1a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-gpg-config-devel \
treesitter-grammar-src-tree-sitter-gpg-config"

RDEPENDS:${PN} += ""

inherit rpm
