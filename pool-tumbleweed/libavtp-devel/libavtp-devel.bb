SUMMARY = "Header files for the Audio/Video Transport Protocol support library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libavtp."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "libavtp-devel-0.2.0-2.11.aarch64.rpm"
RPM_HASH = "5821d8714d67146be64dfe42e260987c31d3e40c0e8863b635167181422772a74682650f6ede4b31f8e5ad0846734ab7c47d2044bdcda569d7e7ffe04912032e"

RPROVIDES:${PN} += "libavtp-devel \
pkgconfig-avtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavtp0"

inherit rpm
