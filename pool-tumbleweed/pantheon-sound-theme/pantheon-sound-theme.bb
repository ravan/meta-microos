SUMMARY = "The elementary.io sound theme"
DESCRIPTION = "A set of system sounds for the Pantheon Desktop."
LICENSE = "Unlicense"

PV = "1.1.0"

RPM_NAME = "pantheon-sound-theme-1.1.0-1.6.noarch.rpm"
RPM_HASH = "5ba94ddb635f4642ee930a4309523d2453e5c37bf903a885d127f0e4d601efee502b042cf058fcf4d57de7784f447fcccf0bc85314814b348c29a0abbfcb105c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-sound-theme \
pantheon-sound-theme"

RDEPENDS:${PN} += ""

inherit rpm
