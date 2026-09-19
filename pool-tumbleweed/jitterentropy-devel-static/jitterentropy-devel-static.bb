SUMMARY = "Jitter entropy generator static library"
DESCRIPTION = "The Jitter RNG provides a noise source using the CPU execution \
timing jitter. It depends on a high-resolution time stamp. \
 \
This package contains the static library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "3.6.3"

RPM_NAME = "jitterentropy-devel-static-3.6.3-1.6.aarch64.rpm"
RPM_HASH = "6a8fe2fa6dc78fb3364fa650a72ec007390d9f67689a474fcb3dbffd6acb3b1a12fe133272dc3937714a8774fa30239d36ed4c4e07738afa0f633098cc559f97"

RPROVIDES:${PN} += "jitterentropy-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
