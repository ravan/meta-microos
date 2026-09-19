SUMMARY = "Documentation for qt6-3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-3d-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "1ee62b76dd5e2a9712ea463b1493aba4778e270bc0f2b76d119c9cb7b7dbaf1b04544dd30765682e7e5badc2b4bc485e989e49344ea45bcd4c69deeecee776cc"

RPROVIDES:${PN} += "qt6-3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
