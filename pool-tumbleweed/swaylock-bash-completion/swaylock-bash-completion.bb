SUMMARY = "Bash completion for swaylock"
DESCRIPTION = "Bash command line completion support for swaylock."
LICENSE = "MIT"

PV = "1.8.6"

RPM_NAME = "swaylock-bash-completion-1.8.6-1.2.noarch.rpm"
RPM_HASH = "b51c646dbdb5e4e872fb86b22def656cc83fd5899ddc0ab211f30b09214c21cff7f4afa58cf5c8d58de67de48864b491c9623c69299c9bdb292df84beed0e30f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swaylock-bash-completion"

RDEPENDS:${PN} += "swaylock"

inherit rpm
