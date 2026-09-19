SUMMARY = "Zsh Completion for sonobuoy"
DESCRIPTION = "zsh command line completion support for sonobuoy."
LICENSE = "Apache-2.0"

PV = "0.57.5"

RPM_NAME = "sonobuoy-zsh-completion-0.57.5-1.3.noarch.rpm"
RPM_HASH = "ed98d2dcb02c4112a3e5e7ed686e648dfbe7db27d119305a6476838ecfcd316b3c047805efbb71b8fa3f99606f566afd8a872855660ec739f9c025fe38c33744"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sonobuoy-zsh-completion"

RDEPENDS:${PN} += "sonobuoy"

inherit rpm
