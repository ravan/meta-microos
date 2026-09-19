SUMMARY = "Devel package for tree-sitter-typescript containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.2"

RPM_NAME = "tree-sitter-typescript-devel-0.23.2-3.1.noarch.rpm"
RPM_HASH = "1d4e19c7442f012b5008e09a93e5546b83393fd6e239ac53710cbc0eb99908ac06c45060b43dc1c62847ce082c04950519efc9f9d5d5d2651395717205842c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-typescript-devel \
treesitter-grammar-src-tree-sitter-typescript"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-javascript"

inherit rpm
