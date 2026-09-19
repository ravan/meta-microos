SUMMARY = "Quickstart configs for Nvim LSP"
DESCRIPTION = "default Nvim LSP client configurations for various LSP servers"
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "nvim-lspconfig-2.11.0-1.1.noarch.rpm"
RPM_HASH = "e81435ae95b6ee34eb6c85ea9a58d81260180f7d5a399c804982e65f8292bb375c4d87603a3c0a363dd3809a339315a0335a9f97d801bcf7c530fa973654ca25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvim-lspconfig"

RDEPENDS:${PN} += "neovim"

inherit rpm
