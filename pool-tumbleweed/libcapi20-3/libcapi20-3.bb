SUMMARY = "Library for the Common ISDN Application Programming Interface"
DESCRIPTION = "libcapi handles requests from CAPI-driven applications such as fax \
systems via active and passive ISDN cards."
LICENSE = "LGPL-2.1-or-later"

PV = "3.27"

RPM_NAME = "libcapi20-3-3.27-2.19.aarch64.rpm"
RPM_HASH = "6a64ca1db04a9449794f2770e07e14db7ac84c63f6d191aa4b24aba56b7021ff76f9a25fd86607c30065f35d9bebc49ef49633f444497b6ffc1097117559f75f"

RPROVIDES:${PN} += "capi4linux \
lib-capi-mod-fritzbox.so.2 \
lib-capi-mod-rcapi.so.2 \
lib-capi-mod-std.so.2 \
libcapi20-3 \
libcapi20.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
