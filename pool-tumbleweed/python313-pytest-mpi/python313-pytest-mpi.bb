SUMMARY = "MPI plugin for pytest"
DESCRIPTION = "mpi plugin for pytest to collect information from openmpi-based tests."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "python313-pytest-mpi-0.6-4.7.noarch.rpm"
RPM_HASH = "38830a282e1206853df068a50a3df44281c29bde09625d2fe7526c2d9c39e25e7848331e5642dede3329a8a58c01fd99c949e7ed33488c6c66bc9e16417d61dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mpi \
python3.13dist-pytest-mpi \
python313-pytest-mpi \
python3dist-pytest-mpi"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
