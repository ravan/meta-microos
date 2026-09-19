SUMMARY = "Efficient evaluation of integrals over ab initio effective core potentials"
DESCRIPTION = "Libecpint is a C++ library for the efficient evaluation of integrals over ab \
initio effective core potentials, using a mixture of generated, recursive \
code and Gauss-Chebyshev quadrature. It is designed to be standalone and \
generic."
LICENSE = "MIT"

PV = "v1.0.7+git20230218.8e788d4"

RPM_NAME = "libecpint1-v1.0.7+git20230218.8e788d4-1.9.aarch64.rpm"
RPM_HASH = "7579e5e0ee24edc811f5093c8590227f3fee9edea73538cd7297bb0d432027c08622fc997518baa7a7c5785868dd2af28696d3db4368fc16f64cb6383fb52566"

RPROVIDES:${PN} += "libecpint.so.1 \
libecpint1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerf.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
