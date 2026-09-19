SUMMARY = "Zsh Completion for harbor-cli"
DESCRIPTION = "zsh command line completion support for harbor-cli."
LICENSE = "Apache-2.0"

PV = "0.0.25"

RPM_NAME = "harbor-cli-zsh-completion-0.0.25-1.1.noarch.rpm"
RPM_HASH = "37d619f15a2ee96a809f491e5639bd5f6fe96461aeb354e025aa6767e5eca5f26695a9c3a035e2bb440266aa27392768da6fb1d483c0b360d3ebc77be8a58e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "harbor-cli-zsh-completion"

RDEPENDS:${PN} += "harbor-cli"

inherit rpm
