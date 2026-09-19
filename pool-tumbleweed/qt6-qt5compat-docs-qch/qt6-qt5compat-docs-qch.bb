SUMMARY = "Documentation for qt6-qt5compat in QCH format"
DESCRIPTION = "This package contains documentation for qt6-qt5compat in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-qt5compat-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4bc2bdf3aaf5f7121c0a2a75ca58564c4d479132ed466bcb9da7fcf0289e6d0cdffe44c1e5b24e4a2f235bde3dfe4d736df72984aaf0e7baeafa0b756da7bb09"

RPROVIDES:${PN} += "qt6-qt5compat-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
