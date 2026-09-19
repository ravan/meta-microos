SUMMARY = "A library to integrate ublk into existing projects"
DESCRIPTION = "A helper library to integrate ublk into existing projects."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "libublksrv0-1.6-2.3.aarch64.rpm"
RPM_HASH = "875f69021edabae925f80120c24c1bac49c6f845c08f9048a4de895c4df4584f47c2b29c4a02b10ce3896cc608af6dd2259702cfe7df9d952c257608fcb5daa1"

RPROVIDES:${PN} += "libublksrv.so.0 \
libublksrv0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
liburing.so.2"

inherit rpm
