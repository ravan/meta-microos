SUMMARY = "A C++ library for relativistic kinematics"
DESCRIPTION = "rk provides a C++ double precision implementation of several \
basic geometric entities and transformations: points in 3d, \
directions in 3d (unit vectors), 3-vectors, points in 4d, \
4-vectors, rotations, linear transformations, and boosts. The main \
purpose of the package is representing 4-momenta of relativistic \
particles and related formulae. \
 \
This package provides the source files required for development \
with rk."
LICENSE = "X11"

PV = "1.8"

RPM_NAME = "rk-devel-1.8-1.11.aarch64.rpm"
RPM_HASH = "9c61e7c3a45bade074add1ff000de2ec9e8e1fcc472021254c768ddba8b71e9e7cc54cea0a8599d290d321c1c0a78535ad5bb9a4ce42e556c156333424134858"

RPROVIDES:${PN} += "pkgconfig-rk \
rk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librk0"

inherit rpm
