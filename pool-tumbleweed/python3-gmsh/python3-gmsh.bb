SUMMARY = "Python API for the gmsh mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the public gmsh API for Python."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & (GPL-2.0-or-later | LGPL-3.0-or-later) & LGPL-2.1-or-later & MPL-2.0 & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & CC0-1.0 & X11"

PV = "4.15.2"

RPM_NAME = "python3-gmsh-4.15.2-1.4.noarch.rpm"
RPM_HASH = "414db35cd77426378e8af78c78a78283d19f59938b995095ef063256af36d33f59618685a7c1863385c94257a006ba86084ab2b5a54ee70412826cce96734cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gmsh \
python3.13dist-gmsh \
python3dist-gmsh"

RDEPENDS:${PN} += "libgmsh4-15 \
python-abi"

inherit rpm
