SUMMARY = "Device Mapper Tools"
DESCRIPTION = "Programs and man pages for configuring and using the device mapper."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.38_1.02.212"

RPM_NAME = "device-mapper-2.03.38_1.02.212-2.5.aarch64.rpm"
RPM_HASH = "121acdd9acbf06083f00cb97fcafd55f98327cb9ec7a5d1ea785dfbe0ed67dbcf0b3707704e3b32f34678e8224c0ae05fd093a3ad588c349b5d151bc1990f37e"

RPROVIDES:${PN} += "device-mapper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper-event.so.1.03 \
libdevmapper.so.1.03 \
thin-provisioning-tools"

inherit rpm
