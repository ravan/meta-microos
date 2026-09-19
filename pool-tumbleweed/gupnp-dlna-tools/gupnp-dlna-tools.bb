SUMMARY = "A collection of helpers for building DLNA applications"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "gupnp-dlna-tools-0.12.0-1.22.aarch64.rpm"
RPM_HASH = "61149c26fe09a6ba28db7030ab276128fa87f83a7fe881fa2c6a1220fb0a28558bf0e2b98a454fc5507a01422c4341d55dc0ee2d05b35cfad92de8193c2eafee"

RPROVIDES:${PN} += "gupnp-dlna-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgupnp-dlna-2.0.so.4"

inherit rpm
