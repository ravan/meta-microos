SUMMARY = "IP address range management tool for FireHOL"
DESCRIPTION = "This tool manages IP address ranges for FireHOL."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "iprange-2.1.1-1.2.aarch64.rpm"
RPM_HASH = "67cdc747ca5fdc1d68fb38559ea1b05b0e8671b798fdaa07ed656ee43c2c15bc65c548d9026cb0c4d3b44fd89f723b3a1147a25a510c8b131626a18a54d46b14"

RPROVIDES:${PN} += "iprange"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
