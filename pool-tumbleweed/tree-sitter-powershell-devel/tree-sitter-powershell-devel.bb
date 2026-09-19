SUMMARY = "Devel package for tree-sitter-powershell containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.26.4"

RPM_NAME = "tree-sitter-powershell-devel-0.26.4-1.1.noarch.rpm"
RPM_HASH = "6eeba2911a7329c8503cc655778edcf4e540b16ad019499f9130a27f08c2c56541957f106b9e3cfe3a889584e40d6a6601165ae1b75e630eaa71b6f2d3965c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-powershell-devel \
treesitter-grammar-src-tree-sitter-powershell"

RDEPENDS:${PN} += ""

inherit rpm
