SUMMARY = "Development files for the uriparser URL parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
This subpackage contains the headers and other developments \
files needed to build packagesfor that depend on uriparser."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "uriparser-devel-1.0.2-2.2.aarch64.rpm"
RPM_HASH = "e33372d55fd6d8d84643ba522fdca9cde688f924a6cc908ad1fb8d5230d7f26cd155d01cb6f1f395174aeff74dbc554de1416864e87ea2b420cf948de4dfc4b4"

RPROVIDES:${PN} += "cmake-uriparser \
liburiparser-devel \
pkgconfig-liburiparser \
uriparser-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liburiparser1"

inherit rpm
