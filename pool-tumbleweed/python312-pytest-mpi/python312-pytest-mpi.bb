SUMMARY = "MPI plugin for pytest"
DESCRIPTION = "mpi plugin for pytest to collect information from openmpi-based tests."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "python312-pytest-mpi-0.6-3.1.noarch.rpm"
RPM_HASH = "3bed2248a540e144bbd32492c51837dc8ccbe659cef824d3e286d25a5974179511fec7ec10d37a05c4f2789d0720bc54091f927f41d4d29ba93fc3764d09d844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-pytest-mpi \
python312-pytest-mpi \
python3dist-pytest-mpi"

RDEPENDS:${PN} += "python-abi \
python312-pytest"

inherit rpm
