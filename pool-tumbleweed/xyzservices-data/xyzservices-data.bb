SUMMARY = "Source of XYZ tiles providers - common data package"
DESCRIPTION = "xyzservices is a lightweight library providing a repository \
of available XYZ services offering raster basemap tiles. \
The repository is provided via Python API and as a compressed \
JSON file. \
 \
XYZ tiles can be used as background for your maps to provide \
necessary spatial context. xyzservices offer specifications \
of many tile services and provide an easy-to-use tools to \
plug them into your work, no matter if interactive or static. \
 \
This package provides the common compressed JSON file for the \
pythonXY-xyzservices packages."
LICENSE = "BSD-3-Clause"

PV = "2026.9.1"

RPM_NAME = "xyzservices-data-2026.9.1-1.1.noarch.rpm"
RPM_HASH = "d3a0e8984fec857c8bc526f7e6d08814cb3ded6d54ca225c8f41c63964f70647efea933e0ccca84dd4c9d44c405db2d039dd73d1f8aa2eda462d4f95b3c41da4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xyzservices-data"

RDEPENDS:${PN} += ""

inherit rpm
