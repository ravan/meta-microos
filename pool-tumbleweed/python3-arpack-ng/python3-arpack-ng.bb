SUMMARY = "Python bindings for ARPACK"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package provides the python \
bindings for ARPACK."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "python3-arpack-ng-3.9.1-4.6.aarch64.rpm"
RPM_HASH = "d472c5d34ce5ca896b1e7dd255a69f19795b2aa8ccb5438f75ad2637b116405585e1a33b06573ec6d639831d4c5007ba87712be2aa61be5e3ee5b9604f83d5d0"

RPROVIDES:${PN} += "python3-arpack-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-numpy-py3.so.1.91.0 \
libboost-python-py3.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
