SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
Ice theme"
LICENSE = "GPL-3.0-only"

PV = "20220219.1.26"

RPM_NAME = "openSUSE-e-X-Ice-Icons-20220219.1.26-2.2.noarch.rpm"
RPM_HASH = "84912f552cc5e07d7035b05e58d6f170ea2d5d7ef8944336f6ce445c83b789b2e39cb9766222d7bd2462e72659463ace490496ff580fdb35747daa78fcb79ec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Ice-Icons"

RDEPENDS:${PN} += ""

inherit rpm
