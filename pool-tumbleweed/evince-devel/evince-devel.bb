SUMMARY = "Header files for the Evince Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript. \
 \
This package contains the header files for building additional plugins."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "evince-devel-48.4-2.1.aarch64.rpm"
RPM_HASH = "e6a957a9dbf041d2ecdfa10a9d2fb34da04868e216cf2798c1dab3353ef38ff2925ef13f2d09960bb07b3e248bdc8e1f77a1ebc211bfc4920d9edbae6aac8d57"

RPROVIDES:${PN} += "evince-devel \
pkgconfig-evince-document-3.0 \
pkgconfig-evince-view-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
evince \
libevdocument3-4 \
libevview3-3 \
pkgconfig-gio-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-EvinceDocument-3-0 \
typelib-1-0-EvinceView-3-0"

inherit rpm
