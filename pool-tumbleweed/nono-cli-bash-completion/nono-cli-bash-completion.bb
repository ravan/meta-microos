SUMMARY = "Bash Completion for nono-cli"
DESCRIPTION = "Bash command line completion support for nono-cli."
LICENSE = "Apache-2.0"

PV = "0.77.0"

RPM_NAME = "nono-cli-bash-completion-0.77.0-1.1.noarch.rpm"
RPM_HASH = "240023a6c96fec995d481a5e71779ba81e876dc06bf3f766ba143103782cbacb9deb92047181bb10704cd4fd6d57b93e83c9f408260ea678df63b39b5d3c6d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nono-cli-bash-completion"

RDEPENDS:${PN} += "nono-cli"

inherit rpm
