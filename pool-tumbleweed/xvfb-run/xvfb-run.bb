SUMMARY = "Script to run a virtualized X-Server"
DESCRIPTION = "This script starts an instance of Xvfb, the 'fake' X server, runs a command \
with that server available, and kills the X server when done. The return \
value of the command becomes the return value of this script."
LICENSE = "GPL-2.0-only"

PV = "1.5.2"

RPM_NAME = "xvfb-run-1.5.2-9.2.noarch.rpm"
RPM_HASH = "9da28e553996ce4bb788aa635e3695421bd86e862ff6682ae604c9b86ac09903388c6d7a79ac3210cacaa6834c745c41661cd5c9ed4604af60dc08c25ab2dfae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xvfb-run"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
util-linux \
which \
xauth \
xorg-x11-server \
xorg-x11-xauth"

inherit rpm
