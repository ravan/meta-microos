SUMMARY = "Bash Completion for scrot"
DESCRIPTION = "The official bash completion script for scrot"
LICENSE = "SUSE-Scrot"

PV = "1.12.1"

RPM_NAME = "scrot-bash-completion-1.12.1-2.4.noarch.rpm"
RPM_HASH = "de98efbac2fb5f892c02b310af2c464d3f50a58d567d26482b6867cca3e7eeeb77628cf71c68d4509a5156eca7f1ec784961e13d2c8748abcdc5e56f2eeb40e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scrot-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
