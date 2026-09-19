SUMMARY = "Openscap utilities"
DESCRIPTION = "The openscap-utils package contains various utilities based on openscap library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "openscap-utils-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "324b2836fbca2781fb1e00dee915b7d1dd2a17c61eb32bfe585d61ece43109cff92ba3f4fb6d9fd0f7155b71ebefdd4c3b241148850a96bdd8494d239cbdf828"

RPROVIDES:${PN} += "openscap-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenscap.so.33 \
libopenscap33 \
openscap \
systemd"

inherit rpm
