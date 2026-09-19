SUMMARY = "Platform support library used by libCEC development files"
DESCRIPTION = "Development files for platform support library used by libCEC and Kodi."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "p8-platform-devel-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "86c69127b8ee024f5c361fb9ee8f7fb41f01acb9287dba4e2dd9dafc7f5fcb3fad50f34fc519805b759a0d82802e5b2f380ec228eb1e7a6b5864eae5b99459ac"

RPROVIDES:${PN} += "p8-platform-devel \
pkgconfig-p8-platform"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libp8-platform2"

inherit rpm
