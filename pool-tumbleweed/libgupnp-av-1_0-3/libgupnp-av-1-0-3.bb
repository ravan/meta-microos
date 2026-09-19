SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.5"

RPM_NAME = "libgupnp-av-1_0-3-0.14.5-1.3.aarch64.rpm"
RPM_HASH = "a3cf551313d06ea3b844c3508c153b002025600d839b960697588da4bff2386c2cd4e2f210741a183cdf25e9d535d3363241221c171f3a6cfe6181d4f5f8d43c"

RPROVIDES:${PN} += "libgupnp-av-1-0-3 \
libgupnp-av-1.0.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
gupnp-av \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.16"

inherit rpm
