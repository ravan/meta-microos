SUMMARY = "RepRap STL plater"
DESCRIPTION = "Plater is a GUI tool to prepare printing plate from STL files for ReRap. \
It is a part of Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0+73"

RPM_NAME = "plater-2.2.0+73-1.6.noarch.rpm"
RPM_HASH = "aae7f97ba0f8bea83f8e963548e682f740c1659eda78f1b2059b5d6588d3423e61813178b8561509a793e2a0db5edaebcf601953eb0398bf9a3bd8ef4aff96ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plater"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
Printrun-common \
python3-wxPython"

inherit rpm
