SUMMARY = "Development Libraries for QGIS"
DESCRIPTION = "Development packages for QGIS, including the C header files."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "qgis-devel-4.2.1-1.2.aarch64.rpm"
RPM_HASH = "20309a98abdd205e201d0d7cba4122aa0c4166dd5cd27703d61a13211a8bb970915064a371cfe6e7cc0d8fc0af113fe2cd341884f1d1616d74e3024ea3e9f0c2"

RPROVIDES:${PN} += "qgis-devel"

RDEPENDS:${PN} += "python3-PyQt6-devel \
qgis"

inherit rpm
