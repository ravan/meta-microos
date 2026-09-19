SUMMARY = "Device mount library"
DESCRIPTION = "Library designed to be used in low-level utils like \
mount(8) and /usr/sbin/mount.<type> helpers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libmount1-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "0dade2ad6e22346d74f91d80716964d81629ef055957b1374d5643ee41dff3146dfbe4698ae97a1d42094a586442ed6d18aa70dbcb6ae29c1e1384fea441da81"

RPROVIDES:${PN} += "libmount.so.1 \
libmount1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
