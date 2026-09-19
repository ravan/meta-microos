SUMMARY = "The XML-Parse library"
DESCRIPTION = "XML parser with support for Vala iterators."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.14"

RPM_NAME = "libxmlbird1-1.2.14-1.12.aarch64.rpm"
RPM_HASH = "c0e893ba9c9afa033c34ec5858813419327cc8700408763c913f5738fe0baad0572db2c3b0a13517f3227f3677676097f98f00c53e0f864dd9e342779257915d"

RPROVIDES:${PN} += "libxmlbird.so.1 \
libxmlbird1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
