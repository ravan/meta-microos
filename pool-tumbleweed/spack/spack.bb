SUMMARY = "Package manager for HPC systems"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package provides a module file that must be loaded to use spack."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.23.1"

RPM_NAME = "spack-0.23.1-2.6.noarch.rpm"
RPM_HASH = "47c5c989c5357bc663df8374983c8fa3ade0a3ee2c0f7d4fc35264efbe456636bef816211d5322c274e704036efc33b47cd57ea5c67283d94ef76659489eec3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-spack \
group-spack \
spack"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
awk \
bzip2 \
coreutils \
curl \
gcc-c++ \
gcc-fortran \
git \
gpg2 \
gzip \
libbz2-devel \
lsb-release \
make \
patch \
polkit \
python3-clingo \
spack-recipes \
sudo \
system-user-nobody \
tar \
unzip \
xz \
zstd"

inherit rpm
