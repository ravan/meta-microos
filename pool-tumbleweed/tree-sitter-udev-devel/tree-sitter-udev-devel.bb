SUMMARY = "Devel package for tree-sitter-udev containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "tree-sitter-udev-devel-0.2.1-2.4.noarch.rpm"
RPM_HASH = "52d432d257fc5ca940c2c3003a5b078c77c96f3c4a030a849736a20c2342cbb470fbb9368a1bc1b5c259afc775114b9168ff85ad76d6a69f619cffe4eb0a5f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-udev-devel \
treesitter-grammar-src-tree-sitter-udev"

RDEPENDS:${PN} += ""

inherit rpm
