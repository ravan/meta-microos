SUMMARY = "Runtime libraries for tcmu-runner"
DESCRIPTION = "This package contains the runtime libraries for tcmu-runner."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "libtcmu2-1.6.2-4.6.aarch64.rpm"
RPM_HASH = "2da981bc0a35f0b552b232650fcccb6a85afd6ac4db8ee0ff5a77420b69ba0860c8968ba9ae1e38b79edf7eddd2118a3761fef2512fd4dfe57a06589699a0318"

RPROVIDES:${PN} += "libtcmu.so.2 \
libtcmu2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libtcmalloc.so.4"

inherit rpm
