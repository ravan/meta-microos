SUMMARY = ".NET library for the Google Data API"
DESCRIPTION = "This package provides a simple protocol for the Google Data APIs (GData)."
LICENSE = "Apache-2.0"

PV = "1.4.0.2"

RPM_NAME = "gdata-sharp-devel-1.4.0.2-27.6.noarch.rpm"
RPM_HASH = "66068a2f8c4b87b095b24cb94e1c2f0c2b8c5e0efcd0ba03c9578ab2e2f96285d333ba973a9271b7dc5c0dcc408a730c64d2319d5673523a69324a2846aa7fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdata-sharp-devel \
pkgconfig-gdata-sharp-acl \
pkgconfig-gdata-sharp-apps \
pkgconfig-gdata-sharp-base \
pkgconfig-gdata-sharp-blogger \
pkgconfig-gdata-sharp-calendar \
pkgconfig-gdata-sharp-codesearch \
pkgconfig-gdata-sharp-contacts \
pkgconfig-gdata-sharp-core \
pkgconfig-gdata-sharp-documents \
pkgconfig-gdata-sharp-health \
pkgconfig-gdata-sharp-photos \
pkgconfig-gdata-sharp-spreadsheets \
pkgconfig-gdata-sharp-youtube"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gdata-sharp \
pkgconfig-gdata-sharp-acl \
pkgconfig-gdata-sharp-core"

inherit rpm
