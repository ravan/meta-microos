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

RPM_NAME = "python313-pyswarms-1.3.0-1.1.noarch.rpm"
RPM_HASH = "8c63c72af76f8bca51129ad1d7bad6cce9f22797faf35590635129fc06b9fc7768b704b422ad4e1c138747156e89842a6df87c96588962aa6d73537d31e93cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyswarms \
python3.13dist-pyswarms \
python313-pyswarms \
python3dist-pyswarms"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-attrs \
python313-matplotlib \
python313-numpy \
python313-scipy \
python313-tqdm"

inherit rpm
