SUMMARY = "Documentation for qt6-datavis3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-datavis3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-datavis3d-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5d8eac715b8e05a1f6268873f1c1c4665b88ca39bf768f0c1ab8cf5e17c6bd732c7e4be4e953e0457f2f00c0c305d966a85be2fd92a477e26ed24c58fc04705d"

RPROVIDES:${PN} += "qt6-datavis3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
