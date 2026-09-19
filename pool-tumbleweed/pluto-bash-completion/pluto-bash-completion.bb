SUMMARY = "Bash Completion for pluto"
DESCRIPTION = "Bash command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.24.3"

RPM_NAME = "pluto-bash-completion-5.24.3-1.1.noarch.rpm"
RPM_HASH = "08eb7cd5681bd8473d4d197de377bc3a9f59bd5547723a8b14f65700f1b43e816d14015943fe88df39973ed424ced51c0c3e4cf8a8df60045d1f7a37ba13a63f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-bash-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
