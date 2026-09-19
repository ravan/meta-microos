SUMMARY = "Zsh Completion for melange"
DESCRIPTION = "zsh command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "melange-zsh-completion-0.59.2-1.1.noarch.rpm"
RPM_HASH = "aa219956c2e9c410379b26e2045c055429b1d0ea2c34cf61edfc2e24315ab4b9bff2cd8c34e9ddd5bf00727909599fe64e14525bab574f8ed2c1ef1fc2d8950f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-zsh-completion"

RDEPENDS:${PN} += "melange"

inherit rpm
