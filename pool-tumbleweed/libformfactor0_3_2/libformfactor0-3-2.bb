SUMMARY = "Efficient computation of scattering form factors of arbitrary polyhedra"
DESCRIPTION = "Efficient computation of scattering form factors (Fourier shape transforms) of \
arbitrary polyhedra according to Wuttke, J Appl Cryst 54, 580-587 (2021). \
 \
This package contains the share library."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.2"

RPM_NAME = "libformfactor0_3_2-0.3.2-1.4.aarch64.rpm"
RPM_HASH = "f8c7845ebb7dc13c59bc21140e217eea920f1412e892f2ccbc10b8e0fb5be8390fdd5996e6db5a27bc12ce4add161960ffca3a1a99de4740efbccdc478e72cc3"

RPROVIDES:${PN} += "libformfactor.so.0.3.2 \
libformfactor0-3-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
