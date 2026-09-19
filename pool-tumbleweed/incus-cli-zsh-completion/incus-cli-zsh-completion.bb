SUMMARY = "Zsh Completion for incus-cli"
DESCRIPTION = "Zsh command line completion support for incus-cli."
LICENSE = "Apache-2.0"

PV = "7.4"

RPM_NAME = "incus-cli-zsh-completion-7.4-1.1.noarch.rpm"
RPM_HASH = "68943e68fe239c7b57148f5da1b855ca66763844eb016d7876e9d6be2f88aea85ab024e71a7a0e7186dd8f79a7a53d9d390ab6861f17b235203f1853ae2793c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "incus-cli-zsh-completion \
incus-zsh-completion"

RDEPENDS:${PN} += "incus-cli"

inherit rpm
