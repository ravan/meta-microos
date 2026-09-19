SUMMARY = "Documentation for qt6-webview in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webview in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-webview-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "653105aeb492586d08d9c57179628f6fbeb4095c16d54772259bd33516ccaa5b1d0280169dd9209165fd4dda310d898945d548d5f73f0c53314c715e6371786e"

RPROVIDES:${PN} += "qt6-webview-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
