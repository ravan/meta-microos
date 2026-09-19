SUMMARY = "C++ matrix library with interfaces to LAPACK and ATLAS"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package provides the shared libraries for armadillo."
LICENSE = "Apache-2.0"

PV = "15.2.4"

RPM_NAME = "libarmadillo15-15.2.4-1.2.aarch64.rpm"
RPM_HASH = "654e772711e5381e87ef99c33b1ba080c931518bc5228ff161fda237f332d26c139cf2df0186bf455969cb8c65ab957d2245f118c2c3986faab8ba49b4c7be33"

RPROVIDES:${PN} += "libarmadillo.so.15 \
libarmadillo15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libarpack.so.2 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
liblapack.so.3 \
libm.so.6 \
libstdc++.so.6 \
libsuperlu.so.7"

inherit rpm
