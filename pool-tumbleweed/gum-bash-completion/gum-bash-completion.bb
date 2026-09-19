SUMMARY = "Bash Completion for gum"
DESCRIPTION = "Bash command-line completion support for gum."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "gum-bash-completion-0.16.0-1.8.noarch.rpm"
RPM_HASH = "39706fa8670eaee996c401b5048db1cd220f775e2d489663c347ac4f38e031c36194db69c6d524dc4ec99bd625c99e0c64e2aad1503334199fa4469ec59d0f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gum-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
