SUMMARY = "Zsh Completion for tealdeer"
DESCRIPTION = "Zsh command-line completion support for tealdeer."
LICENSE = "Apache-2.0 | MIT"

PV = "1.8.0"

RPM_NAME = "tealdeer-zsh-completion-1.8.0-1.7.noarch.rpm"
RPM_HASH = "eb8106c254bc17d30103701f6463b12092191b341e93cbf8bbb43d1fac9d80d72cd1277b7854c469b7518c096ee31de3533bf951a3f8687d05c0adc196ac4663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tealdeer-zsh-completion"

RDEPENDS:${PN} += "tealdeer \
zsh"

inherit rpm
