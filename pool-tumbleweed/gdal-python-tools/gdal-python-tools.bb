SUMMARY = "Command line tools written in Python for GDAL"
DESCRIPTION = "This package contains the command line utilities that ship with GDAL and \
are written in Python (gdal_calc.py, gdal_merge.py, gdal2tiles.py, ...)."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-python-tools-3.13.3-1.1.noarch.rpm"
RPM_HASH = "3a4f3812c881808a459c8452056594357efe6ad73491977cefbc8c0ad9b10b7a2451ced07d9cbeefe81f6415452621a4e4a257b86963b0ad06fcf163c4b13b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdal-python-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gdal \
python3-GDAL"

inherit rpm
