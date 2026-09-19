SUMMARY = "Devel package for tree-sitter-javascript containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "tree-sitter-javascript-devel-0.23.1-4.1.noarch.rpm"
RPM_HASH = "9217969362f70dcf3336ad4d16fdf1da0a2643ebe80956c871b6b7e53157605d01c7927ddf32b7c60fd855c525881ad074deea44394141d1b69c0fb52a00488b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-javascript-devel \
treesitter-grammar-src-tree-sitter-javascript"

RDEPENDS:${PN} += ""

inherit rpm
