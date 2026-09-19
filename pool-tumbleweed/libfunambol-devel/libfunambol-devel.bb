SUMMARY = "C++ SyncML Client Engine"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libfunambol."
LICENSE = "AGPL-3.0"

PV = "9.0.1"

RPM_NAME = "libfunambol-devel-9.0.1-16.35.aarch64.rpm"
RPM_HASH = "34339ab550fec73ada6dc935d3f7c3ec73a2bec5586d151c65d892b08705fd429426706238b7b070f01a536f3cc87531d20e0348fb488e74925542b2853251bd"

RPROVIDES:${PN} += "libfunambol-devel \
pkgconfig-libfunambol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcurl-devel \
libfunambol-9-0-1"

inherit rpm
