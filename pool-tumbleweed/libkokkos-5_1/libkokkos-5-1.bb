SUMMARY = "A C++ Performance Portability Programming Library"
DESCRIPTION = " \
Kokkos Core implements a programming model in C++ for writing performance \
portable applications targeting all major HPC platforms. For that purpose \
it provides abstractions for both parallel execution of code and data \
management.  Kokkos is designed to target complex node architectures with \
N-level memory hierarchies and multiple types of execution resources. It \
currently can use OpenMP, Pthreads and CUDA as backend programming models. \
 \
This package contains the kokkos library."
LICENSE = "BSD-3-Clause"

PV = "5.1.1"

RPM_NAME = "libkokkos-5_1-5.1.1-1.2.aarch64.rpm"
RPM_HASH = "9d4fb1f99cda77e31810245a588e17ff7d98268cd892f76a04516099a9b91b1bede3dceb5c9a6544206005728ff3862afe3b3c9f0f8e04cec044a373958cd2a5"

RPROVIDES:${PN} += "libkokkos-5-1 \
libkokkosalgorithms.so.5.1 \
libkokkoscontainers.so.5.1 \
libkokkoscore.so.5.1 \
libkokkossimd.so.5.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhwloc.so.15 \
libstdc++.so.6"

inherit rpm
