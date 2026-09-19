SUMMARY = "Bash Completion for git-absorb"
DESCRIPTION = "The official bash completion script for git-absorb, generated during the build."
LICENSE = "BSD-3-Clause"

PV = "0.6.17"

RPM_NAME = "git-absorb-bash-completion-0.6.17-1.9.noarch.rpm"
RPM_HASH = "96f3b7e8160315a2d18058d853452a12f44f05540c3f929eb508a6d0245121f93c08b57fb942995d36697b4e8bb06890708bf8f59e5cf447f93407d4d91faa79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-absorb-bash-completion"

RDEPENDS:${PN} += "bash-completion \
git-absorb"

inherit rpm
