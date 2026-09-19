SUMMARY = "Library for accessing the Secret Service API"
DESCRIPTION = "libsecret is a library for storing and retrieving passwords and other \
secrets. It communicates with the 'Secret Service' using DBus."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.7"

RPM_NAME = "libsecret-1-0-0.21.7-2.4.aarch64.rpm"
RPM_HASH = "934924f69946fcc66fe54e505511a8d9159d3c90db7324520fdc0bec792404d09c7c6bac296b021c94a01811db1ebf8645a45c394a65f5c9fd5e6099459bd7af"

RPROVIDES:${PN} += "libsecret \
libsecret-1-0 \
libsecret-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
