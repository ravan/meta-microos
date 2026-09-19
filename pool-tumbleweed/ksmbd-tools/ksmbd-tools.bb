SUMMARY = "ksmbd kernel server userspace utilities"
DESCRIPTION = "Set of utilities for creating and managing SMB3 shares for the ksmbd kernel \
module."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.3"

RPM_NAME = "ksmbd-tools-3.5.3-2.9.aarch64.rpm"
RPM_HASH = "4885f82f9b57d730f7be752221300579ee4cace6dd7bdf0e3e1a80a9cf5c8a1c22b20926f8fb8bc2691dbef7bdd360a177c666aecfd203e29a461f584c6b1fa7"

RPROVIDES:${PN} += "ksmbd-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
kmod-ksmbd.ko \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
