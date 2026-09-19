SUMMARY = "Bash Completion for typioca"
DESCRIPTION = "The official bash completion script for typioca, generated during the build."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "typioca-bash-completion-3.1.0-1.13.noarch.rpm"
RPM_HASH = "11bfee41570d67c60698609d4211873ad04d7a175f16f9d2320a96ce52210e1dfdd6df2e0545c33ca7141dff33dbdc6b3ed3593739013bba6f39e966a21ad007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typioca-bash-completion"

RDEPENDS:${PN} += "bash-completion \
typioca"

inherit rpm
