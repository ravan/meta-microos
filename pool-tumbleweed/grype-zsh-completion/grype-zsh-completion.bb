SUMMARY = "Zsh Completion for grype"
DESCRIPTION = "zsh command line completion support for grype."
LICENSE = "Apache-2.0"

PV = "0.118.0"

RPM_NAME = "grype-zsh-completion-0.118.0-1.1.noarch.rpm"
RPM_HASH = "edece9e2ecaf8dc21921b8d8a079fc10a16968e5d10c10977b6187b458f5fbaa43dd5cf7225ec7e03f1950e8d763d3d2b63776e2c793c48486f6401553f6dc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grype-zsh-completion"

RDEPENDS:${PN} += "grype"

inherit rpm
