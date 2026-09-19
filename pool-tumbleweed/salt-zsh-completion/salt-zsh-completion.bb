SUMMARY = "Zsh Completion for salt"
DESCRIPTION = "Zsh command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-zsh-completion-3006.0-70.1.noarch.rpm"
RPM_HASH = "994d61031b3656d24b2fbb83956e9282425b5c1c68496955e2ffd094bd844915d6dac8c832b5a0790e6422f6e459f1e5e440aa17031e58756c2b296d21ef67e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-salt-zsh-completion \
salt-zsh-completion"

RDEPENDS:${PN} += "salt \
zsh"

inherit rpm
