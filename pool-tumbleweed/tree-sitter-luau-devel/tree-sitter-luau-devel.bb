SUMMARY = "Devel package for tree-sitter-luau containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "tree-sitter-luau-devel-1.2.0-2.3.noarch.rpm"
RPM_HASH = "a1574247c3f8d71ba3bad08ec0709a002b0090783ec27d02c2b4690997dcb5e8ea758b772f488a734020f0c67a386aa4c9c40fc9d3385bb2832136971dc6d097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-luau-devel \
treesitter-grammar-src-tree-sitter-luau"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-lua"

inherit rpm
