SUMMARY = "Devel package for tree-sitter-pony containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-pony-devel-1.0.0-2.4.noarch.rpm"
RPM_HASH = "7ae877298aff1f46fb9d3b4df903407cd7be5c8faf5b39093793521db26bf73e8adb91c166fa5f0361d6c696390516d9c16c807c2ae0ed239542520f473585ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-pony-devel \
treesitter-grammar-src-tree-sitter-pony"

RDEPENDS:${PN} += ""

inherit rpm
