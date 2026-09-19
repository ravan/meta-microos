SUMMARY = "Zsh Completion for syft"
DESCRIPTION = "zsh command line completion support for syft."
LICENSE = "Apache-2.0"

PV = "1.51.1"

RPM_NAME = "syft-zsh-completion-1.51.1-1.1.noarch.rpm"
RPM_HASH = "e26a906321a68b396a7a5070bc3caf74f3900bcf432faec02a58ce550d0f9795b53149bdcf2f019f58cdd2387d9515335465d3a80a17af4a44cd15b81b26e753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "syft-zsh-completion"

RDEPENDS:${PN} += "syft"

inherit rpm
