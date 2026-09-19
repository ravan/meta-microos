SUMMARY = "Bash completion for fwupd"
DESCRIPTION = "This package contain the bash completion command for the device firmware updater daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.7"

RPM_NAME = "fwupd-bash-completion-2.1.7-2.1.noarch.rpm"
RPM_HASH = "0394e17c5528774b8e070584614376112e663843abaae08b72964bc21780631e2f2f78be3be81b6b00f56281689e6bbc1662feedc3574b863db3929eebd54a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fwupd"

inherit rpm
