SUMMARY = "Library to integrate cloud storage providers"
DESCRIPTION = "Cross desktop library for desktop integration of cloud storage \
providers and sync tools."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.1"

RPM_NAME = "libcloudproviders0-0.4.1-1.1.aarch64.rpm"
RPM_HASH = "b23aac8c3642e860cbd7bb6cde5f260da9afac44d67f1a9bbb72294197432e308be057e161a99ea462d029ab93d0c41128694efc3d220da0e06173e3686f4b7b"

RPROVIDES:${PN} += "libcloudproviders.so.0 \
libcloudproviders0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
