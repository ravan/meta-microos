SUMMARY = "Access KIO over the regular filesystem"
DESCRIPTION = "kio-fuse is a daemon which makes KIO URLs accessible to KIO unaware \
applications using FUSE."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.1"

RPM_NAME = "kio-fuse-5.1.1-1.6.aarch64.rpm"
RPM_HASH = "1c1f291a96cf360ce24c299564f749ce13fb9aed39538001751d0691eb24316e371053fc08c2936e902a2ec3c5fcdeff37d1c9f7a646e7bc484b88bdb2b8d198"

RPROVIDES:${PN} += "kio-fuse"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libfuse3.so.4 \
libstdc++.so.6"

inherit rpm
