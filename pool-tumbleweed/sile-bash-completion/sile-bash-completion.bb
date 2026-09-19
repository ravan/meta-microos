SUMMARY = "Bash Completion for sile"
DESCRIPTION = "Bash command-line completion support for sile."
LICENSE = "MIT"

PV = "0.15.13"

RPM_NAME = "sile-bash-completion-0.15.13-2.7.noarch.rpm"
RPM_HASH = "72060ddeb0da17876bd3f4dff8d86cf47c296ef94fba60ddde79ce262e821a2a3dc1f7c037ded57439d21a90d48d6e895329e4385c66702e80d8c738752a9bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sile-bash-completion"

RDEPENDS:${PN} += "bash-completion \
sile"

inherit rpm
