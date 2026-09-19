SUMMARY = "A Python-based Particle Swarm Optimization (PSO) library"
DESCRIPTION = "PySwarms is an extensible research toolkit for particle swarm optimization \
(PSO) in Python. \
 \
It is intended for swarm intelligence researchers, practitioners, and \
students who prefer a high-level declarative interface for implementing PSO \
in their problems. PySwarms enables basic optimization with PSO and \
interaction with swarm optimizations."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-pyswarms-1.3.0-1.1.noarch.rpm"
RPM_HASH = "0e2f14fb46b7bff4b2405dec57ac5bc975390dd44c02b4ebd30c1b76728ca4ad1c72f1f18ebb0ddb3f012a435eb37a4becd90a4d9f24244d1e0a6ee1a45d4efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyswarms \
python314-pyswarms \
python3dist-pyswarms"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-attrs \
python314-matplotlib \
python314-numpy \
python314-scipy \
python314-tqdm"

inherit rpm
