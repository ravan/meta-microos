SUMMARY = "GNUnet library libgnunethello"
DESCRIPTION = "This package contains the libgnunethello library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunethello0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "78467d11058e56917da567551639f7b70f2fa7cb014aaa9c719d0edac26771b544d87094a062189c8152c83cbff0a929258e85e8e346d93c4c25c31854fd59a8"

RPROVIDES:${PN} += "libgnunethello.so.0 \
libgnunethello0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
