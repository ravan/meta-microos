SUMMARY = "A library for file sharing with WebDAV"
DESCRIPTION = "phodav is a WebDav server implementation using libsoup (RFC 4918). \
 \
This package provides the shared library for phodav."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "libphodav-3_0-0-3.0-3.13.aarch64.rpm"
RPM_HASH = "c890009660ed5419f79febe4ccae79cd4812b800418cab93a62123c2890a4821c64b7846b6c8955c4d0fe1cffdd49f0180e7ff6c0f16d6d56961646cd6acb26d"

RPROVIDES:${PN} += "libphodav-3-0-0 \
libphodav-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
