SUMMARY = "Libraries for openconnect"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, including Cisco's 'AnyConnect' VPN."
LICENSE = "LGPL-2.1-or-later"

PV = "9.21"

RPM_NAME = "libopenconnect5-9.21-1.3.aarch64.rpm"
RPM_HASH = "31864592368b4d8c1825898e76b84aca4fd6394f2cfd6003b6384b9716e630a1a5c0f842115324975d547cef5aefb2ed9db6ef3d0f828be6386759c313005241"

RPROVIDES:${PN} += "libopenconnect.so.5 \
libopenconnect5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
liblz4.so.1 \
libm.so.6 \
libp11-kit.so.0 \
libpcsclite.so.1 \
libproxy.so.1 \
libpskc.so.0 \
libstoken.so.1 \
libxml2.so.16 \
libz.so.1"

inherit rpm
