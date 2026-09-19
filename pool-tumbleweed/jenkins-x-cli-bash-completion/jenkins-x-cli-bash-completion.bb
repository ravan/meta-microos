SUMMARY = "Bash Completion for jenkins-x-cli"
DESCRIPTION = "Bash command line completion support for jenkins-x-cli."
LICENSE = "Apache-2.0"

PV = "3.17.74"

RPM_NAME = "jenkins-x-cli-bash-completion-3.17.74-1.1.noarch.rpm"
RPM_HASH = "64a8231438de8cb308082847cdec546c891b2149cee03ac25345bf3a4353240158405a57900b6214b99de78b36746deb5fc7f4a628982aba44b6897884307522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jenkins-x-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
jenkins-x-cli"

inherit rpm
