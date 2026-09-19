SUMMARY = "Library to assist handling MIME data"
DESCRIPTION = "KMime is a library for handling mail messages and newsgroup articles."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Mime6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0509672010ba62012df58cd585f0812a65b214594f1265b466b12f125774a9221966749fce2f22699210a3b32240c62c18a0b530c0a850e67c1f410166f737c4"

RPROVIDES:${PN} += "libKF6Mime.so.6 \
libKF6Mime6 \
libKPim6mime"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kmime \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
