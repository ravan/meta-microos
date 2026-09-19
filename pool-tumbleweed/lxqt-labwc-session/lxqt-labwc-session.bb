SUMMARY = "Session files and theme for labwc"
DESCRIPTION = "This package contains the openbox themes and other files for labwc."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "lxqt-labwc-session-0.4.1-1.2.noarch.rpm"
RPM_HASH = "eeee3cfbe886c378599be29551e82a2ed56b691b6e423e01cb907031203654d18e63ce08db3f833e3dab29c58d431d1fb5ee6ea704ff38026d561a2b3ecb9542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-labwc-session"

RDEPENDS:${PN} += "labwc \
lxqt-wayland-session \
swaybg \
swayidle \
swaylock"

inherit rpm
