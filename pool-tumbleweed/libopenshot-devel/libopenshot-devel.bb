SUMMARY = "Development files for libopenshot"
DESCRIPTION = "A library for video editing, composition, animation, and playback, \
which focuses on The library is written in C++. \
 \
This package contains header files and libraries needed to develop \
application that use libopenshot."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "libopenshot-devel-1.0.0-1.2.aarch64.rpm"
RPM_HASH = "458bf9c65a328df4962ec228f9868a3e85a5669b09c5ebbfa8d7f9443147fc90f80df327f5b3ddb3bfbd4dcbabae7ff6450e07f4ae488d22a06e5b900c3e82f7"

RPROVIDES:${PN} += "libopenshot-devel"

RDEPENDS:${PN} += "libopenshot31"

inherit rpm
