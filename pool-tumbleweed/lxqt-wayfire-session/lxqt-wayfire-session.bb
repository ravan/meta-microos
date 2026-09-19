SUMMARY = "Session files for LXQt-wayfire"
DESCRIPTION = "This package contains the files necessary to use wayfire as the Wayland \
compositor with LXQt"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "lxqt-wayfire-session-0.4.1-1.2.noarch.rpm"
RPM_HASH = "4db2443d0c292da65c5024c95cbf313fc5b490a2e897ce7ae6f0027bb4612e06e1c32bb9c420f606a8791988924ac3eb6a6ab73a0bb37f785d7d56222cffe45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-wayfire-session"

RDEPENDS:${PN} += "lxqt-wayland-session \
wayfire"

inherit rpm
