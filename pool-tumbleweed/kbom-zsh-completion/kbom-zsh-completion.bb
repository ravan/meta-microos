SUMMARY = "Zsh Completion for kbom"
DESCRIPTION = "zsh command line completion support for kbom."
LICENSE = "Apache-2.0"

PV = "0.3.4"

RPM_NAME = "kbom-zsh-completion-0.3.4-1.4.noarch.rpm"
RPM_HASH = "94cc00ef925f060bf6f7adac88e4af31dd14a9ab07de901859d584cf26a7116a1bd91926e8ecb11f6a9efc2d4b8b01894235b5d3ec7141f1e881d5995e65a55b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbom-zsh-completion"

RDEPENDS:${PN} += "kbom"

inherit rpm
