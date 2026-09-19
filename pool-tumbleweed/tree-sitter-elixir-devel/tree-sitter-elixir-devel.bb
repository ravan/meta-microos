SUMMARY = "Devel package for tree-sitter-elixir containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "Apache-2.0"

PV = "0.3.5"

RPM_NAME = "tree-sitter-elixir-devel-0.3.5-1.1.noarch.rpm"
RPM_HASH = "f023e7cc13faa4cd8784ef826d4596b8d9b157e53cb467c23285b5a95c3a2205e16c867f82474736b3b2de76a3808e8dd3bf6190eb81145effc16820281ae830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-elixir-devel \
treesitter-grammar-src-tree-sitter-elixir"

RDEPENDS:${PN} += ""

inherit rpm
