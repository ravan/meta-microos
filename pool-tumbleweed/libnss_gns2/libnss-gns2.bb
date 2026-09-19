SUMMARY = "GNUnet library libnss_gns"
DESCRIPTION = "This package contains the libnss_gns library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libnss_gns2-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "33542b5b4976c10a28606ae2ec33b78db6cd98f01cda03e1e849508d9834cd3ce8939dd9b88dccb65fe75a899362286003315b70a59a65c380a40b5b826e230f"

RPROVIDES:${PN} += "libnss-gns.so.2 \
libnss-gns2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
