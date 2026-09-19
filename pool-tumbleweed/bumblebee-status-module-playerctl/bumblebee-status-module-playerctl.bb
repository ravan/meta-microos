SUMMARY = "Displays information about the current song using playerctl"
DESCRIPTION = "Displays information about the current song in \
vlc, audacious, bmp, xmms2, spotify and others."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-playerctl-2.1.5-4.7.noarch.rpm"
RPM_HASH = "0e3b8c4dd8e12c0ee7180d61f7f2ed76c07d5256e94e96c1b8bd6333bcccfbe1ff2c8af669313c4e16c3ec2bb793de3f00d8cdbb6411f1e4eb37be6734be3b22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-playerctl"

RDEPENDS:${PN} += "bumblebee-status \
playerctl"

inherit rpm
