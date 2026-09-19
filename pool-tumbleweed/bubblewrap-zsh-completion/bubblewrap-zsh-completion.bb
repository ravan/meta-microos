SUMMARY = "Zsh tab-completion for bubblewrap"
DESCRIPTION = "This package provides zsh tab-completion for bubblewrap."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "bubblewrap-zsh-completion-0.12.0-1.1.aarch64.rpm"
RPM_HASH = "9e2df021d17172612a0887bb139fbedf458d85ec6668a6b340dd3209939c86870b4f7f85792afc555cac7bd9ef3a707751f0e3d7e4548604b2ee7c82304a5b95"

RPROVIDES:${PN} += "bubblewrap-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
