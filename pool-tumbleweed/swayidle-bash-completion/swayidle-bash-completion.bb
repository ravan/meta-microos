SUMMARY = "Bash completion for swayidle"
DESCRIPTION = "Bash command line completion support for swayidle."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "swayidle-bash-completion-1.9.0-1.5.noarch.rpm"
RPM_HASH = "09395368eaa700b9f24dbd3c0f89e3e9b14e025284dec2d79cee873e638bde887f70adac596352b277e00a41ba6cc4e11b76023d030cafabe25e24029c6ec05a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swayidle-bash-completion"

RDEPENDS:${PN} += "swayidle"

inherit rpm
