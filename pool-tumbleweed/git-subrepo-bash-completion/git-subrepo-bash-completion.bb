SUMMARY = "Bash completion for git-subrepo"
DESCRIPTION = "Bash shell completions for git-subrepo"
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "git-subrepo-bash-completion-0.4.9-1.1.noarch.rpm"
RPM_HASH = "85a8d6485b493ebea05c49edd88f27642975f7efb83da35b83f934676539ba41f103e7e23c6c6f4c9aa8c2bd67407a047ffe07cbacb327107831528170860891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-subrepo-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
