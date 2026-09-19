SUMMARY = "Zsh Completion for docker"
DESCRIPTION = "Zsh command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "29.7.2_ce"

RPM_NAME = "docker-zsh-completion-29.7.2_ce-41.1.noarch.rpm"
RPM_HASH = "f848ff3a0fa5f361ee70bec6fcd44bb94063405dcb9ecd4fa7cb9d3a9f28b0ad92e6f588b8e5900a69851fbd2288de24e02788e1e1f87e3b7358586a41ad64c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-zsh-completion"

RDEPENDS:${PN} += "docker \
zsh"

inherit rpm
