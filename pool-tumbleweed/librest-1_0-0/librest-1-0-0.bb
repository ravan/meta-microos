SUMMARY = "Library to access RESTful web services"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on. \
 \
It is comprised of two parts: \
 \
    * the first aims to make it easier to make requests by providing a \
      wrapper around libsoup. \
    * the second aids with XML parsing by wrapping libxml2."
LICENSE = "LGPL-2.1-only"

PV = "0.10.2"

RPM_NAME = "librest-1_0-0-0.10.2-2.1.aarch64.rpm"
RPM_HASH = "cc5c15c6e7cb138eb6eeab0d99657f64df11a6e0ae0c227e44ca0aa628387a64089d479cc1f78eb8ebb6cb02b8d8b0e31812a3c5d6f1caaebcb4679387ad87fa"

RPROVIDES:${PN} += "librest-1-0-0 \
librest-1.0.so.0 \
librest-extras-1.0.so.0 \
librest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
