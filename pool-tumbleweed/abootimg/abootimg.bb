SUMMARY = "Android boot image manipulator"
DESCRIPTION = "Android boot image manipulator. It can create/update/unpack boot.img - boot \
file used by Android OS."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "abootimg-0.6-9.19.aarch64.rpm"
RPM_HASH = "8d96146c963403bfa4e7eec3234c2ecd57a21bcd8bf37417b3fdfe017801e33ab22a3eb5a19f2b826c56ad53a95c7e3e66d2e7bbab472834f79db4119cf1ec13"

RPROVIDES:${PN} += "abootimg"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6"

inherit rpm
