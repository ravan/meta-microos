SUMMARY = "Zsh Completion for jfrog-cli"
DESCRIPTION = "zsh command line completion support for jfrog-cli."
LICENSE = "Apache-2.0"

PV = "2.122.0"

RPM_NAME = "jfrog-cli-zsh-completion-2.122.0-1.1.noarch.rpm"
RPM_HASH = "02df8836fd28f93f5f4463d1b48ea217c136576dcadda3b9d16c2a80eaf5337f3b102d534424e570d989a47c65132e645124abbd8a6ac2db0745beb96c629f32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfrog-cli-zsh-completion"

RDEPENDS:${PN} += "jfrog-cli \
zsh"

inherit rpm
