SUMMARY = "Devel package for tree-sitter-html containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.2"

RPM_NAME = "tree-sitter-html-devel-0.23.2-2.5.noarch.rpm"
RPM_HASH = "b7bd42d578cfc8a81824ff1aad4ccecf21a39bda06b44079190350624c6020996f5e5a7903803ae0ce43ceea0136f2040f865c3640f4fbc1354e902435eb4531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-html-devel \
treesitter-grammar-src-tree-sitter-html"

RDEPENDS:${PN} += ""

inherit rpm
