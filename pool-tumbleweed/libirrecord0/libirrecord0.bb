SUMMARY = "LIRC record library"
DESCRIPTION = "The LIRC record library. To actually use the lirc plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.2"

RPM_NAME = "libirrecord0-0.10.2-2.5.aarch64.rpm"
RPM_HASH = "abb7b7d0031ace483f1b9a3019ee0b9d173984d6b0dd964b6c9cf7286fb4ebd3dd510830187b12edc5b605ecee565c6f9ff4812d9c970f730931988a87d41aa8"

RPROVIDES:${PN} += "libirrecord.so.0 \
libirrecord0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblirc.so.0"

inherit rpm
