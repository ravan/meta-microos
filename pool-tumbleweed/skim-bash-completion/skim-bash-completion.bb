SUMMARY = "Bash Completion for skim"
DESCRIPTION = "The official bash completion script for skim, generated during the build."
LICENSE = "MIT"

PV = "5.7.0"

RPM_NAME = "skim-bash-completion-5.7.0-1.1.noarch.rpm"
RPM_HASH = "e9418335b2d28942fb036e0a7fd9f565ac4d4b68f8b797b47255b8ed3ddaa477d210eb686d612d5a46089f54f283defc6dc84ef55dd08683c3f2f46395b8dbfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skim-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
