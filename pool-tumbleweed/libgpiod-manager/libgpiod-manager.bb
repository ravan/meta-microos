SUMMARY = "DBus manager for GPIO"
DESCRIPTION = "DBus manager for interacting with GPIO character devices."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "libgpiod-manager-2.2.4-1.3.aarch64.rpm"
RPM_HASH = "1a52cb08438f1a6d92e79e8ed78dd1d3b869e2b37cdc6d37e338fced0b95920943176e76ffe5b5e9648df32f9c367c26323b11864d35ae17a99cd5f30ad61563"

RPROVIDES:${PN} += "config-libgpiod-manager \
libgpiod-manager"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpiod \
libgpiod-glib.so.1 \
libgpiodbus.so.1 \
libgudev-1.0.so.0"

inherit rpm
