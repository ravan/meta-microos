SUMMARY = "Development files for librttopo"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use librttopo."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "librttopo-devel-1.1.0-3.9.aarch64.rpm"
RPM_HASH = "8be79f213ae9cda36fb3e16f7c3d8a4163b8bfb86d8748d2812fc0c8791dcdbf8a49ae400ba4576129739fa23251012cc2f96b52b0a1f041088f8fdba0f503f0"

RPROVIDES:${PN} += "librttopo-devel \
pkgconfig-rttopo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librttopo1"

inherit rpm
