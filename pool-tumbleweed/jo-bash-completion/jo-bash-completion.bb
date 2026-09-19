SUMMARY = "Bash Completion for jo"
DESCRIPTION = "Bash completion script for jo."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.9"

RPM_NAME = "jo-bash-completion-1.9-1.12.noarch.rpm"
RPM_HASH = "3c2fd1a83586fa5d4ce088a25507263db1b2950ceae7f241cbe31752accc1eb88b84e6923506cc0c160e9a4c47d82b5102255dd67bafa19fcb9ad196c7ca0f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jo-bash-completion"

RDEPENDS:${PN} += "bash-completion \
jo"

inherit rpm
