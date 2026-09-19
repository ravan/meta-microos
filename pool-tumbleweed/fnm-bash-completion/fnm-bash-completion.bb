SUMMARY = "Bash Completion for fnm"
DESCRIPTION = "Bash command-line completion support for fnm."
LICENSE = "GPL-3.0-only"

PV = "1.38.1"

RPM_NAME = "fnm-bash-completion-1.38.1-1.10.noarch.rpm"
RPM_HASH = "fd804038dc10ea9c04ee0d4b7f0ef158fcef303566cd4484bdc0c6170ed6afa43ece721b3be74f745e045af22357ec8b1d454216cce6cb2f408a3bae06eaf403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fnm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
