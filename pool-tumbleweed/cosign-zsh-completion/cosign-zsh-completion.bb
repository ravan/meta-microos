SUMMARY = "Zsh Completion for cosign"
DESCRIPTION = "zsh command line completion support for cosign."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "cosign-zsh-completion-3.1.2-1.2.noarch.rpm"
RPM_HASH = "ee1ee8152d9c8074faebcc5210b6e6128c252e1cb2587f9de35f168aca13b1afcecc57b8d9c7dda25f72ba7e507f148a6aaf1244ea2781e020c2c03962ac1b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosign-zsh-completion"

RDEPENDS:${PN} += "cosign"

inherit rpm
