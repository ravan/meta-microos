SUMMARY = "Application for updating Flipper Zero firmware - protocol library"
DESCRIPTION = "Application for updating Flipper Zero firmware - protocol library"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.3+git0.1699609231.bfce851"

RPM_NAME = "qFlipper-libflipperproto-1.3.3+git0.1699609231.bfce851-4.11.aarch64.rpm"
RPM_HASH = "76120cabe2850173ad6c40a427a51c46d8769a1282fc1a19389239a938ba92886a22caa09b693413f12dff2cfdeb5f63753aceb2711ebc0df25e37e77fe503b0"

RPROVIDES:${PN} += "libflipperproto0.so \
qFlipper-libflipperproto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
