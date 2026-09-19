SUMMARY = "VOTCA tools library"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains the librares of VOTCA package."
LICENSE = "Apache-2.0"

PV = "2026"

RPM_NAME = "libvotca2026-2026-1.7.aarch64.rpm"
RPM_HASH = "0f49477d6e343211ad9481cd72cbbcdc77af17da0cabe68ea18b793d108a334795bb903edc84a87d8cd67ed4ae4568ab2d9c4333e47bb745f3d0d23f7fa8064b"

RPROVIDES:${PN} += "libvotca-csg.so.2026 \
libvotca-csg2022 \
libvotca-tools.so.2026 \
libvotca-tools2022 \
libvotca-xtp.so.2026 \
libvotca-xtp2022 \
libvotca2026"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libecpint.so.1 \
libexpat.so.1 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libgromacs.so.11 \
libhdf5-cpp.so.310 \
libhdf5.so.310 \
libint2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libxc.so.12"

inherit rpm
