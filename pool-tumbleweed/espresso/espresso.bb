SUMMARY = "Parallel simulation software for soft matter research"
DESCRIPTION = "ESPResSo is a highly versatile software package for performing and analyzing \
scientific Molecular Dynamics many-particle simulations of coarse-grained \
atomistic or bead-spring models as they are used in soft-matter research in \
physics, chemistry and molecular biology. It can be used to simulate systems \
such as polymers, liquid crystals, colloids, ferrofluids and biological \
systems, for example DNA and lipid membranes."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.1"

RPM_NAME = "espresso-5.0.1-1.2.aarch64.rpm"
RPM_HASH = "99eabd858c6d3112b87c46253a95f227c55a30abaaa31ce1fb134a19600883bf6272872d79305e1fb988573591d6b5fedf11597e578945c7613aaaa284b4df2f"

RPROVIDES:${PN} += "espresso \
libEspresso5 \
python3-espressomd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-mpi.so.1.91.0 \
libboost-serialization.so.1.91.0 \
libc.so.6 \
libfftw3-omp.so.3 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libhdf5-openmpi4 \
libkokkoscore.so.5.1 \
libm.so.6 \
libmpi.so.40 \
libnlopt.so.1 \
libstdc++.so.6 \
python-abi \
python313-h5py \
python313-numpy"

inherit rpm
