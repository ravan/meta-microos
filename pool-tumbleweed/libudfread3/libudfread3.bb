SUMMARY = "UDF Reader Library"
DESCRIPTION = "This library allows reading UDF filesystems, like raw devices and image files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libudfread3-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "288d1928705f047beae4bec9a9efded65fb0f06460de63d15d25e3e8806e03aa7dae2666b134f0b233d4c2cdbd06eccd09ebcff56dc75f024cad25268b564dfe"

RPROVIDES:${PN} += "libudfread.so.3 \
libudfread3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
