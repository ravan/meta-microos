SUMMARY = "Devel package for tree-sitter-starlark containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "tree-sitter-starlark-devel-1.3.0-2.4.noarch.rpm"
RPM_HASH = "ecd2f65d070400fdd49d891366c0e7696f13db02d812d21b7327cc5399f512c7de2629b828ed3de8dca0eff4199d5fa7286bee8e866d7775ca8963998f4180fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-starlark-devel \
treesitter-grammar-src-tree-sitter-starlark"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-python"

inherit rpm
