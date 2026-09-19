SUMMARY = "Bash Completion for imgp"
DESCRIPTION = "Bash command line completion support for imgp."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "imgp-bash-completion-3.0-1.1.noarch.rpm"
RPM_HASH = "b8ac3ba50ca75d2c971eddcd38de62156bdb6e7310115c61787eb89246b39879808c06437a537c9cabce7000e2c95a9c6e8afef5c2442a1fe5a251f3f55353a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imgp-bash-completion"

RDEPENDS:${PN} += "bash-completion \
imgp"

inherit rpm
