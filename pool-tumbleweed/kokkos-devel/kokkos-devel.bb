SUMMARY = "Development package for  kokkos packages"
DESCRIPTION = " \
Kokkos Core implements a programming model in C++ for writing performance \
portable applications targeting all major HPC platforms. For that purpose \
it provides abstractions for both parallel execution of code and data \
management.  Kokkos is designed to target complex node architectures with \
N-level memory hierarchies and multiple types of execution resources. It \
currently can use OpenMP, Pthreads and CUDA as backend programming models. \
 \
This package contains the development files of kokkos."
LICENSE = "BSD-3-Clause"

PV = "5.1.1"

RPM_NAME = "kokkos-devel-5.1.1-1.2.aarch64.rpm"
RPM_HASH = "7b2327a349df497f48d9195b5049ff72fe0538ee8fa6c7b07d9c574b7a9fc400776c7639cfca9e696fcf4d6cee10c1562895ff8d9d24d775fe6c8528e89f471a"

RPROVIDES:${PN} += "cmake-Kokkos \
kokkos-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
hwloc-devel \
libkokkos-5-1"

inherit rpm
