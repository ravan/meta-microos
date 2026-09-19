SUMMARY = "Library of exchange and correlation functionals to be used in DFT codes"
DESCRIPTION = "Libxc is a library of exchange and correlation functionals. Its \
purpose is to be used in codes that implement density-functional \
theory. The library includes most of the local density \
approximations (LDAs), generalized density approximation (GGAs), and \
meta-GGAs. The library provides values for the energy density and its \
1st, 2nd, and (for the LDAs) 3rd derivatives. \
 \
This package contains the library of libxc."
LICENSE = "MPL-2.0"

PV = "6.2.2"

RPM_NAME = "libxc12-6.2.2-1.11.aarch64.rpm"
RPM_HASH = "ae66e6cec47fc76a62c568943598d06fbd0519c80d8c35cc56236c1223263e0e0d76bcefe7bd7eb192e0c5abbf0376f423ffcfeedf283e1743918a7d02b52dda"

RPROVIDES:${PN} += "libxc.so.12 \
libxc12 \
libxcf03.so.12 \
libxcf90.so.12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
