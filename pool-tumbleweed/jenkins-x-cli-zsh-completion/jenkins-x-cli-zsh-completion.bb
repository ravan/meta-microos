SUMMARY = "Zsh Completion for jenkins-x-cli"
DESCRIPTION = "zsh command line completion support for jenkins-x-cli."
LICENSE = "Apache-2.0"

PV = "3.17.74"

RPM_NAME = "jenkins-x-cli-zsh-completion-3.17.74-1.1.noarch.rpm"
RPM_HASH = "e3f66ece306b97c79077fbe5ed8a38addf41dcffd460eea5a1e09ff3af815e1d00448a19bc50f9ecae91e2832d07d4a6c6ca23d8e0ea6719bf0361a029b0567d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jenkins-x-cli-zsh-completion"

RDEPENDS:${PN} += "jenkins-x-cli"

inherit rpm
