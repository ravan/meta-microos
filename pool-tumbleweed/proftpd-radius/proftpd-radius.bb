SUMMARY = "Radius Module for ProFTPD"
DESCRIPTION = "This is the Radius Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.9c"

RPM_NAME = "proftpd-radius-1.3.9c-2.1.aarch64.rpm"
RPM_HASH = "82bb699cad82a22b4c2ead3f7663dfabfc43becf4c96b753b9267e0b46080758af23f0ad79b25c62a052fa79581eca3089b6415135d4177fafb559fbb1eef12d"

RPROVIDES:${PN} += "proftpd-radius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
proftpd"

inherit rpm
