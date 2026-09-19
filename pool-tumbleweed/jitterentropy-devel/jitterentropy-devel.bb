SUMMARY = "Jitter entropy generator development header and library"
DESCRIPTION = "The Jitter RNG provides a noise source using the CPU execution \
timing jitter. It depends on a high-resolution time stamp. \
 \
This package contains the development header and library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "3.6.3"

RPM_NAME = "jitterentropy-devel-3.6.3-1.6.aarch64.rpm"
RPM_HASH = "8a7de00711af918e0728cc7e2c0f9479533fa4b07cbd065548e5757d13ca7acd417f2cf49d64c0723f44a5ae5cc4bf253582dc77dc544ccd598d77890fd324e0"

RPROVIDES:${PN} += "jitterentropy-devel"

RDEPENDS:${PN} += "libjitterentropy3"

inherit rpm
