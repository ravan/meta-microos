SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.23"

RPM_NAME = "libvlc5-3.0.23-7.12.aarch64.rpm"
RPM_HASH = "6a91876be75f7413158b8053b477a2e9ae224be907cd6ac8bfcd8a14b9c8a132c11a3bde1215de354fdfce4e24b43417747f3fc2378d33784b8ec5180ee2e3eb"

RPROVIDES:${PN} += "libvlc.so.5 \
libvlc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libvlccore.so.9"

inherit rpm
