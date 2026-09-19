SUMMARY = "Development package for programs that use Redland"
DESCRIPTION = "Files needed to develop with the Redland RDF library."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libredland-devel-1.0.17-6.8.aarch64.rpm"
RPM_HASH = "66112421e9810b5884729ab7ff916a02233248e3ea437a503dc2e1ca46c0b66435f45d098f479ec666edc3512429389207998566a65bc5f6a65a651e1af822fc"

RPROVIDES:${PN} += "libredland-devel \
pkgconfig-redland"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
librdf0 \
pkgconfig-raptor2 \
pkgconfig-rasqal"

inherit rpm
