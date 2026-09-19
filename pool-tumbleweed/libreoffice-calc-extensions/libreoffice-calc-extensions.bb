SUMMARY = "LibreOffice Calc Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Calc: \
 \
- Convert Text to Number \
- New Functions NUMBERTEXT and MONEYTEXT \
- Solver for Nonlinear Programming"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-calc-extensions-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "ec804500c3ace55e9453532febd9ada2a93d5b36543e78406cdb6f44b3d290d13c1f40efe7f7d33e1234693737d9762f8a47cbd117c3e70e50c460677fee0eac"

RPROVIDES:${PN} += "libreoffice-calc-extensions"

RDEPENDS:${PN} += "jre \
libreoffice \
libreoffice-calc \
libreoffice-pyuno"

inherit rpm
