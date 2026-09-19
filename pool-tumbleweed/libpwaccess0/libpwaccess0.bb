SUMMARY = "Library to access pwaccess and pwupd services"
DESCRIPTION = "The libpwaccess library provides interfaces to communicate with pwaccessd \
and pwupdd."
LICENSE = "GPL-2.0-or-later & BSD-2-Clause & LGPL-2.1-or-later"

PV = "1.4.0+git20260717.3914e08"

RPM_NAME = "libpwaccess0-1.4.0+git20260717.3914e08-2.1.aarch64.rpm"
RPM_HASH = "67247d76cfb8360c657c6f90d6483e15739d7c6a42009130cb879978a5c4a1c9387433265e45bbaa6463a1a5ed95f8245e4eefda3d408f1c0a0d952fc7a9ef66"

RPROVIDES:${PN} += "libpwaccess.so.0 \
libpwaccess0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
