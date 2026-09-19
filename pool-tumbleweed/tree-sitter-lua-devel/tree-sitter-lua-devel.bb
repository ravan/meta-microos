SUMMARY = "Devel package for tree-sitter-lua containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "tree-sitter-lua-devel-0.5.0-2.1.noarch.rpm"
RPM_HASH = "a2e0d88464a757b9106aee5e48868a725046cbe10f704b60647e6d08cb2c71d5bedf5401c20de31612327edd3798b49c1c3106fa31aec9dec8da99123c02ceaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-lua-devel \
treesitter-grammar-src-tree-sitter-lua"

RDEPENDS:${PN} += ""

inherit rpm
