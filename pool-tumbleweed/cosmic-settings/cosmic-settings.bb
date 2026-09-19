SUMMARY = "COSMIC Settings"
DESCRIPTION = "The settings application for the COSMIC desktop environment. Developed with \
libcosmic, using the iced GUI library."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-settings-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "c9776d946ec72af239f26c6e4fdbb5b3e42a399861ccb56faf9b1c5566ef96d0adaa53c480b3b82db87443fcd75ba00148edd97adf4b6b92f325028033cb3d8e"

RPROVIDES:${PN} += "cosmic-settings"

RDEPENDS:${PN} += "NetworkManager-connection-editor \
NetworkManager-openvpn \
accountsservice \
cosmic-randr \
cosmic-settings-daemon \
iso-codes \
libc.so.6 \
libdav1d.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libudev.so.1 \
libxkbcommon.so.0"

inherit rpm
