SUMMARY = "Spack built-in package recipes"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package contains the built-in package recipes."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.23.1"

RPM_NAME = "spack-recipes-0.23.1-2.6.noarch.rpm"
RPM_HASH = "35d68e764595d704049f2096b76fcccf7f2316d33024e0d70ea296e1292473c102fa0bba2c5c4601410906b9e50b9f030de7c2bfda9cbd5a97b401c44a3c2e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-recipes"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
spack"

inherit rpm
