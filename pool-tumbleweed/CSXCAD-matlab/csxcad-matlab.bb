SUMMARY = "MATLAB interface for openEMS"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties. \
 \
This package provides MATLAB interface for CSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "CSXCAD-matlab-0.6.3-5.1.noarch.rpm"
RPM_HASH = "6eaca940366f412ba2a772b0f0c803aa7bb9a2bd227342c9848d387400e4694715003ab1b34a7af4a98c78b9f6a73450da796585fcbb812287a632085b1770a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "CSXCAD-matlab"

RDEPENDS:${PN} += ""

inherit rpm
