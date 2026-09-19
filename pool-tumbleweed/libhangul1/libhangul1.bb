SUMMARY = "The Hangul input library"
DESCRIPTION = "Hangul input library used by scim-hangul and ibus-hangul"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "libhangul1-0.2.0-1.5.aarch64.rpm"
RPM_HASH = "1a5c58d07f00fb5f447f11a4922da8c14d3242115abeb516bc043a21b80a2dae81af9355023069e1fbd1e8cae56d5fa4608bf4e8322b35b0afd1846692b4ff77"

RPROVIDES:${PN} += "libhangul.so.1 \
libhangul1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
