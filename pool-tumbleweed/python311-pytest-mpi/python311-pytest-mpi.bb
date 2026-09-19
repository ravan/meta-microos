SUMMARY = "MPI plugin for pytest"
DESCRIPTION = "mpi plugin for pytest to collect information from openmpi-based tests."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "python311-pytest-mpi-0.6-3.1.noarch.rpm"
RPM_HASH = "9a961b3ec5505f29b1ed23bf931a600bd9ad6202c2a506979f422989873735f1f52fc801ba9b96d4b6710cb50dfa27f55b6018c0be069214154f2ea2fce680ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mpi \
python3.11dist-pytest-mpi \
python311-pytest-mpi \
python3dist-pytest-mpi"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
