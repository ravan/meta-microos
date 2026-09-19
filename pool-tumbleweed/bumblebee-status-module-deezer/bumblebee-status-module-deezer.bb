SUMMARY = "Widget for deezer"
DESCRIPTION = "Displays the current song being played in deezer and provides \
some media control bindings."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-deezer-2.1.5-4.7.noarch.rpm"
RPM_HASH = "3f22fc102a98e60287c1223f3c0dd3e80585033de16f88cf132e278e4e2919b400ed31a3bc08df81533ca5b1bb18be68a6191321e5bd1709d4137a9bd170efdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-deezer"

RDEPENDS:${PN} += "bumblebee-status \
python3-dbus-python"

inherit rpm
