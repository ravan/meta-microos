SUMMARY = "Bash completion for redminecli"
DESCRIPTION = "This package contains the bash completion command for redminecli."
LICENSE = "CECILL-B"

PV = "1.3.0"

RPM_NAME = "redminecli-bash-completion-1.3.0-1.19.noarch.rpm"
RPM_HASH = "4c672ee0cee1fb87e89b4dd42dfef650efcccdbbecbb8b9f0911e1a0a95dc5b8a1dac13c74f69836db3e280cf81c2bad05ece5b362f694f1f097b661b72ad34f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redminecli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
redminecli"

inherit rpm
