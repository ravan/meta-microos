SUMMARY = "Zsh completion for dkms"
DESCRIPTION = "Zsh command line completion support for dkms."
LICENSE = "GPL-2.0-only"

PV = "3.3.0"

RPM_NAME = "dkms-zsh-completion-3.3.0-1.3.noarch.rpm"
RPM_HASH = "42645d71aa57fe03d0f7a2eba55f3ddf6b7756333522e0d1ec3dceab1e6b0832f99a927c657fa802f5354c9b40364b11f0d3d8c72c6efcc15d22b343b781aea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dkms-zsh-completion"

RDEPENDS:${PN} += "dkms \
zsh"

inherit rpm
