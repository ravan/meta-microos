SUMMARY = "Displays and changes the current keyboard layout"
DESCRIPTION = "Displays and changes the current keyboard layout."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-layout-2.1.5-4.7.noarch.rpm"
RPM_HASH = "df1ac865f73af29c5245f928d1f72c9ae1df8a21351721235f705c10cbd1d89f053cac3bdf6a5609e56a135a3a92c7c7abacf266e35959ba6c7358a18f78f741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-layout"

RDEPENDS:${PN} += "bumblebee-status \
setxkbmap"

inherit rpm
