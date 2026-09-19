SUMMARY = "Man Page for Spack - Package manager for HPC systems"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package contains the man page."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.23.1"

RPM_NAME = "spack-man-0.23.1-2.6.noarch.rpm"
RPM_HASH = "fec575928468a3cfd23b7889128f9a0ae8c77cf8bbc188b0b6c79eaf2807a3618c134214c1d16dc4d375cac6449ddcbe9be318a69144cd72aed7426f8fd3da19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-man"

RDEPENDS:${PN} += "man"

inherit rpm
