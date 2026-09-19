SUMMARY = "Bash Completion for glow"
DESCRIPTION = "Bash command-line completion support for glow."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "glow-bash-completion-3.0.0-1.1.noarch.rpm"
RPM_HASH = "8a2c82e23aef4e260faf54abd12703c136afce0574766f363c593f170505a4a6dbd1527384abc3f73a3adf105dce30676360bcb532882343281fafd37fefd455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glow-bash-completion"

RDEPENDS:${PN} += "bash-completion \
glow"

inherit rpm
