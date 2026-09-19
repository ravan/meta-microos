SUMMARY = "Documentation for qt6-imageformats in QCH format"
DESCRIPTION = "This package contains documentation for qt6-imageformats in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-imageformats-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "89e3d499c5c0e4e002b57c1ebc9ae7e292c0d086d83e1e4218f20ac742a71fa91c597e352355e1f033e0d850d15b0bc9c3c187be1d155afb1de1b0af40cd8acc"

RPROVIDES:${PN} += "qt6-imageformats-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
