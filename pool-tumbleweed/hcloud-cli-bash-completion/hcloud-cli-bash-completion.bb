SUMMARY = "Bash Completion for hcloud-cli"
DESCRIPTION = "Bash command line completion support for hcloud-cli."
LICENSE = "MIT"

PV = "1.67.0"

RPM_NAME = "hcloud-cli-bash-completion-1.67.0-1.1.noarch.rpm"
RPM_HASH = "2868daaa687c2e07f9ac92e6157afad7b8967c8a1fa3a6b8dd9fd16a34583d78ecf126ea07ed4b942ecfd015815fccded47ca2c4b8e2ad4271d8b4b9c17ebbfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hcloud-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
hcloud-cli"

inherit rpm
