SUMMARY = "MPI plugin for pytest"
DESCRIPTION = "mpi plugin for pytest to collect information from openmpi-based tests."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "python314-pytest-mpi-0.6-4.7.noarch.rpm"
RPM_HASH = "416e47a4689a2007b8f2b2a1c338e415fd78996930883c72ea49498ddc2ecbde021f73139487658e15144160fe1e8b6c02af47adc5c3ab21427de39f111912f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-mpi \
python314-pytest-mpi \
python3dist-pytest-mpi"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
