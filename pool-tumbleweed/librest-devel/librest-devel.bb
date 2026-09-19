SUMMARY = "Library to access RESTful web services - Development Files"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on."
LICENSE = "LGPL-2.1-only"

PV = "0.10.2"

RPM_NAME = "librest-devel-0.10.2-2.1.aarch64.rpm"
RPM_HASH = "6f874f00eb11999f9b4e31f96ffe8bc76c59b51faf42582882c789d96a31186b0ee29e987fb8831d00346b7e7a0438a3a651dc1deb39529f324b390e0617a1b6"

RPROVIDES:${PN} += "librest-devel \
pkgconfig-rest-1.0 \
pkgconfig-rest-extras-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librest-1-0-0 \
pkgconfig-glib-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-rest-1.0 \
typelib-1-0-Rest-1-0"

inherit rpm
