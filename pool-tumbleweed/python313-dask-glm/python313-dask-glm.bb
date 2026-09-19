SUMMARY = "Generalized Linear Models with Dask"
DESCRIPTION = "Generalized Linear Models with Dask."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python313-dask-glm-0.4.0-1.1.noarch.rpm"
RPM_HASH = "5c33177d26070a146c0f82b9ec73d1393a6efdd80ce89eb9b8f4698fd831da4bced9641c7a90a08d7f2874eb7191a45ed345094e325afa66c51b69d0ffc36baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-glm \
python3.13dist-dask-glm \
python313-dask-glm \
python3dist-dask-glm"

RDEPENDS:${PN} += "python-abi \
python313-cloudpickle \
python313-dask \
python313-distributed \
python313-multipledispatch \
python313-numba \
python313-numpy \
python313-scikit-learn \
python313-scipy \
python313-sparse"

inherit rpm
