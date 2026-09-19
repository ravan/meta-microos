SUMMARY = "Documentation for qt6-lottie in QCH format"
DESCRIPTION = "This package contains documentation for qt6-lottie in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-lottie-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "80d20850772a9dac1af8445a25db890bfec5f3d5b0e29a3a0cbe4596a268f82876d87c65501fb04367939b7d82aa6cc7c2af73d46e419009b35eac06f49f179a"

RPROVIDES:${PN} += "qt6-lottie-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
