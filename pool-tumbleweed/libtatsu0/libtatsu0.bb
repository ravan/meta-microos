SUMMARY = "Apple's Tatsu Signing Server Communication Librar"
DESCRIPTION = "Library handling the communication with Apple's Tatsu Signing Server (TSS)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5+3git.20250922"

RPM_NAME = "libtatsu0-1.0.5+3git.20250922-1.5.aarch64.rpm"
RPM_HASH = "c001230333508aa925012fdc9d69aef7bd40f31389ecd667f567ccfc6d2636937842c847c9a58c97b0452f10c6673aacbfc2754978d45e946830da3b24bb90b3"

RPROVIDES:${PN} += "libtatsu.so.0 \
libtatsu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libplist-2.0.so.4"

inherit rpm
