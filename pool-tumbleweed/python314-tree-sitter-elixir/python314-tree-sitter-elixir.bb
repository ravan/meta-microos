SUMMARY = "Python binding for the elixir tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_elixir that loads the grammar library \
shipped in tree-sitter-elixir and exposes it to python-tree-sitter via language()."
LICENSE = "Apache-2.0"

PV = "0.3.5"

RPM_NAME = "python314-tree-sitter-elixir-0.3.5-1.1.aarch64.rpm"
RPM_HASH = "2161ab205c53dea128a68e4b6e80398b3728125a7a7a21fd45f0f6f3c839d1501690d9d0e9dd722bfb09a5997fe26364b1408e9ba3b3e3687bd3c089c5729e3e"

RPROVIDES:${PN} += "python314-tree-sitter-elixir"

RDEPENDS:${PN} += "python-abi \
tree-sitter-elixir"

inherit rpm
