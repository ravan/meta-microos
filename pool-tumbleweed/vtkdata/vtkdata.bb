SUMMARY = "Kitware VTK Library Data"
DESCRIPTION = "The Visualization ToolKit (VTK) is an open source, freely available \
software system for 3D computer graphics, image processing, and \
visualization used by thousands of researchers and developers around \
the world. \
 \
This package contains some example data for the Toolkit."
LICENSE = "BSD-3-Clause"

PV = "9.5.1"

RPM_NAME = "vtkdata-9.5.1-1.4.noarch.rpm"
RPM_HASH = "fbcacaadf834ac8a1d7880aff548e4c2f9e0e481d206ba6f17c572a86a785df4dc1225d3accf703c57457527fe541b11cffb77e828314500ad662b76fcecbbb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vtkdata \
vtklargedata"

RDEPENDS:${PN} += ""

inherit rpm
