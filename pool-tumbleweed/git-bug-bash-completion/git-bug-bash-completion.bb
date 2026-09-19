SUMMARY = "Bash completion for git-bug"
DESCRIPTION = "Bash shell completions for git-bug"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "git-bug-bash-completion-0.10.1-7.1.noarch.rpm"
RPM_HASH = "93b619700fd2ec1c2960d98a83a50793c8af3cd904c574b68172018eb28e0c8375409d3addc1aaf4359b22cd8facb0e2bc0adcd15771e13460e296bc44d1747a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-bug-bash-completion"

RDEPENDS:${PN} += "bash-completion \
git-bug"

inherit rpm
