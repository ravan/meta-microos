SUMMARY = "MATLAB interface for openEMS"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method. \
 \
This package provides MATLAB interface for openEMS."
LICENSE = "GPL-3.0-only"

PV = "0.0.36"

RPM_NAME = "openEMS-matlab-0.0.36-4.8.aarch64.rpm"
RPM_HASH = "87cec277253cf848d82c7163f597401bf0483450bbc929c113dcccc65d621d6e5e498b998657ffaf775855e0de520ea1691b22d4289d96ec6b8afcf793090efd"

RPROVIDES:${PN} += "openEMS-matlab"

RDEPENDS:${PN} += "AppCSXCAD \
CSXCAD-matlab \
openEMS"

inherit rpm
