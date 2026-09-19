SUMMARY = "Bash completion for glab"
DESCRIPTION = "Bash command line completion support for glab."
LICENSE = "MIT"

PV = "1.115.0"

RPM_NAME = "glab-bash-completion-1.115.0-1.1.noarch.rpm"
RPM_HASH = "9b89b8c1e0c7e53db88071290dc0a6e40180fcfaa37ea3c94a418addc937931567991d4392f2ba23608f7791a23add80b5c92b3ba9f248be1efa737c1646b2f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-bash-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
