SUMMARY = "Info Page for Spack - Package manager for HPC systems"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package contains the info page."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.23.1"

RPM_NAME = "spack-info-0.23.1-2.6.noarch.rpm"
RPM_HASH = "4eeb0f191bf420d7c199e5a7425380d31b0325dd980b4458c61f80345c552d90d28460315702b1937f6e7d31ca9a5105eacb14ab0d27d5bb27f55a79d17bb24e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-info"

RDEPENDS:${PN} += "info"

inherit rpm
