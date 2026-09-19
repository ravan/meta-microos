SUMMARY = "Devel package for tree-sitter-yuck containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.0.2"

RPM_NAME = "tree-sitter-yuck-devel-0.0.2-2.4.noarch.rpm"
RPM_HASH = "5991af99b375d9bce420fe70af750ea1396f904aa4bb483e90ff51ad468b7f0ce4f46bb96866c543487a48b5f9b4ac41c31b38652fc55d8e7d504973cfe39d5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-yuck-devel \
treesitter-grammar-src-tree-sitter-yuck"

RDEPENDS:${PN} += ""

inherit rpm
