SUMMARY = "Versatile Object-oriented Toolkit for Coarse-graining Applications"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors."
LICENSE = "Apache-2.0"

PV = "2026"

RPM_NAME = "votca-2026-1.7.aarch64.rpm"
RPM_HASH = "10a3f4075e324cff5ad80b5a2d7da8bc851d44987703fe8c540eabe246471efce0a9435f7a5b175f36c154dad92051538066f97070d5a07b1c4d01f98d80ad83"

RPROVIDES:${PN} += "votca \
votca-csg \
votca-csg-apps \
votca-tools \
votca-xtp"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5-cpp.so.310 \
libm.so.6 \
libstdc++.so.6 \
libvotca-csg.so.2026 \
libvotca-tools.so.2026 \
libvotca-xtp.so.2026"

inherit rpm
