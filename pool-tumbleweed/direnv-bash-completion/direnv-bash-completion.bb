SUMMARY = "Bash Completion for direnv"
DESCRIPTION = "Bash command-line completion support for direnv."
LICENSE = "MIT"

PV = "2.37.1"

RPM_NAME = "direnv-bash-completion-2.37.1-1.8.noarch.rpm"
RPM_HASH = "c5664c64267431caae6a96884304b96fabb18bf37ee6ae7dc54153d622bbd58469fe3f2758637efcc85988d2ad1396fe3346d19e723476d8e3d8cba952264016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "direnv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
direnv"

inherit rpm
