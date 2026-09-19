SUMMARY = "Vacuum-IM user mood plugin"
DESCRIPTION = "Vacuum-IM plugin to send and receive information about user moods."
LICENSE = "GPL-3.0-only"

PV = "0.0.1"

RPM_NAME = "vacuum-im-plugins-usermood-0.0.1-9.33.aarch64.rpm"
RPM_HASH = "85f6de2463cc7d99c8212fc84375290b3b331ff05c9d6048c6504bf0080072d134de0f0dc20cac315772efb91a9a965ae5d839bfeca88f557e5c454a04c3cd1f"

RPROVIDES:${PN} += "libusermood.so \
vacuum-im-plugins-usermood"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37"

inherit rpm
