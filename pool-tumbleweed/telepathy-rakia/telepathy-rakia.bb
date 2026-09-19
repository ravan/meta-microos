SUMMARY = "SIP connection manager for Telepathy"
DESCRIPTION = "IETF SIP connection manager for Telepathy using the SofiaSIP protocol \
stack; formerly known as telepathy-sofiasip"
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.0"

RPM_NAME = "telepathy-rakia-0.8.0-5.22.aarch64.rpm"
RPM_HASH = "c8f1de8c5e4baf8ce3bb42c5b434e1f298ab0f2be8ed71491574b1467ae8c1b98ff2b497776cffb8af54cb09f25532246a88a58daae8b9c3059d6191ca94598d"

RPROVIDES:${PN} += "telepathy-rakia \
telepathy-sofiasip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsofia-sip-ua-glib.so.3 \
libsofia-sip-ua.so.0 \
libtelepathy-glib.so.0"

inherit rpm
