SUMMARY = "Headers for iODBC"
DESCRIPTION = "This package contains headers for the iODBC Driver Manager."
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.16"

RPM_NAME = "libiodbc-devel-3.52.16-2.3.aarch64.rpm"
RPM_HASH = "1c86635397e638ca26c86e7041792cf5b3d86a330a452710d411e07baac1a0e28c09322a691c2e5f1ead1b910f2c7ac4c2a97e3f4edb0245ab3f31cc43a71bb4"

RPROVIDES:${PN} += "libiodbc-devel \
pkgconfig-libiodbc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
iodbc \
libdrvproxy2 \
libiodbc2 \
libiodbcadm2 \
pkgconfig-gtk+-2.0"

inherit rpm
