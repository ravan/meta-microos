SUMMARY = "Generalized Linear Models with Dask"
DESCRIPTION = "Generalized Linear Models with Dask."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python314-dask-glm-0.4.0-1.1.noarch.rpm"
RPM_HASH = "cc1a0e734b1311aeea7c3c736fea5a1163a867280d490036284aaff6b9308bcdc1fdb4b3f0f9be247c38ec2ea4585f82291756c659e283ed74af631345c9c6a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dask-glm \
python314-dask-glm \
python3dist-dask-glm"

RDEPENDS:${PN} += "python-abi \
python314-cloudpickle \
python314-dask \
python314-distributed \
python314-multipledispatch \
python314-numba \
python314-numpy \
python314-scikit-learn \
python314-scipy \
python314-sparse"

inherit rpm
