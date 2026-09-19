SUMMARY = "Development headers and documentation for mpdecimal"
DESCRIPTION = "The package contains documentation and development headers for \
libmpdec and libmpdec++."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "mpdecimal-devel-4.0.1-2.6.aarch64.rpm"
RPM_HASH = "9b5f80dc607dce90717c1bfb1b5968dee60f959e225fc44bb89bb7bb6844cc987157f2532c6eb8afa402e59b703be6a4b487390c1b684b50f26445a0687b935c"

RPROVIDES:${PN} += "mpdecimal-devel \
pkgconfig-libmpdec \
pkgconfig-libmpdec++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpdec++4 \
libmpdec4"

inherit rpm
