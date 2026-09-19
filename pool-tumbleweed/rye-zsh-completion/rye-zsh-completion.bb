SUMMARY = "Zsh Completion for rye"
DESCRIPTION = "Zsh command-line completion support for rye."
LICENSE = "MIT"

PV = "0.44.0"

RPM_NAME = "rye-zsh-completion-0.44.0-1.8.noarch.rpm"
RPM_HASH = "fc9448681fceb091c002849d44d1ed5590e2fd4971655f3f447a40186cd15b308a3d34d8c1615ebc613e4de669bdb260b1209a9d9bddf33186e3ac14d00086cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rye-zsh-completion"

RDEPENDS:${PN} += "rye \
zsh"

inherit rpm
