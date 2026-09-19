SUMMARY = "Bash Completion for cbonsai"
DESCRIPTION = "Bash completion script for cbonsai."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "cbonsai-bash-completion-1.4.2-1.5.noarch.rpm"
RPM_HASH = "e4bb54225bb01a60af9e2980e89ebe18c46e383a2e4b440a8c5d1102185c5389d6d1246d5146693cde485347a5bbf89a44c642a2f055ce124901324271c2dfc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cbonsai-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cbonsai"

inherit rpm
