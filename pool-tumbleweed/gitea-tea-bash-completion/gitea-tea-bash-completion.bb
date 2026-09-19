SUMMARY = "Bash Completion for Gitea's tea CLI"
DESCRIPTION = "Bash command line completion support for Gitea's tea CLI."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "gitea-tea-bash-completion-0.16.0-1.1.noarch.rpm"
RPM_HASH = "a205a461f28bf979c5d7921ca985f017657dcc38bf06dbc7e1fab12d6e7e0b4a088ab9066fdd2ba6923ef6767e3a600c6cdad122955dbb0b2dab3550985e0ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitea-tea-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gitea-tea"

inherit rpm
