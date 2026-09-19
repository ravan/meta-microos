SUMMARY = "C++ library for arithmetic and algebraic computations"
DESCRIPTION = "Givaro is a C++ library for arithmetic and algebraic computations. \
 \
Its main features are implementations of the basic arithmetic of many \
mathematical entities: Primes fields, Extensions Fields, Finite \
Fields, Finite Rings, Polynomials, Algebraic numbers, Arbitrary \
precision integers and rationals. It also provides data structures \
and templated classes for the manipulation of basic algebraic \
objects, such as vectors, matrices (dense, sparse, structured), \
univariate polynomials (and therefore recursive multivariate). \
 \
It contains different program modules and is fully compatible with \
the LinBox linear algebra library and the KAAPI kernel for \
Adaptative, Asynchronous Parallel and Interactive programming."
LICENSE = "CECILL-B"

PV = "4.2.2"

RPM_NAME = "libgivaro9-4.2.2-1.3.aarch64.rpm"
RPM_HASH = "8c0748af570d341ba10179dce9d5acf75c24f314c455ce00c3a45464f4ab9c4e99caca709ecb97c06cf10f57599a7f89d917b7d482e158917c2e378b9e77ffde"

RPROVIDES:${PN} += "libgivaro.so.9 \
libgivaro9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
