SUMMARY = "Documentation for nvim-lspconfig"
DESCRIPTION = "Documentation for nvim-lspconfig."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "nvim-lspconfig-doc-2.11.0-1.1.noarch.rpm"
RPM_HASH = "a45cd8eb3d4ef4a6249d7c0295cf40278716040e25de07088a0de14f134e44eedebc7107f47d3d75f2c95dbcd5b2f8572cc7b23351e75d02c00a79ca7be2b4d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvim-lspconfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
