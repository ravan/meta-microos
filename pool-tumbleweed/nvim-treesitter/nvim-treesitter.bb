SUMMARY = "Nvim Treesitter configurations and abstraction layer"
DESCRIPTION = "The goal of nvim-treesitter is both to provide a simple and easy way to use the \
interface for tree-sitter in Neovim and to provide some basic functionality such \
as highlighting based on it."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "nvim-treesitter-0.10.0-1.4.noarch.rpm"
RPM_HASH = "85853be3174c4343758931bd235649c3aaabf1a67135a0ecf3ac6bd41956401540efe3c5128123acc7fc6323c2c86f2e567acbac87c1e580b928742b68746360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvim-treesitter"

RDEPENDS:${PN} += "neovim"

inherit rpm
