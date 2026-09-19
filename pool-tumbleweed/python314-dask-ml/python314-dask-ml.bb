SUMMARY = "A library for distributed and parallel machine learning"
DESCRIPTION = "Dask-ML provides scalable machine learning in Python using Dask alongside \
popular machine learning libraries like Scikit-Learn and XGBoost."
LICENSE = "BSD-3-Clause"

PV = "2025.1.0"

RPM_NAME = "python314-dask-ml-2025.1.0-1.1.noarch.rpm"
RPM_HASH = "5e946eb54e7ec688fe752f503d0eed2d543c434cc6cd93de75a5f61a2951a8f450edc409b9b33073ddfb65158b1b035f97a0cfd2a083f9281a4378c3a10db20f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dask-ml \
python314-dask-ml \
python3dist-dask-ml"

RDEPENDS:${PN} += "python-abi \
python314-dask \
python314-dask-array \
python314-dask-dataframe \
python314-dask-glm \
python314-distributed \
python314-multipledispatch \
python314-numba \
python314-numpy \
python314-packaging \
python314-pandas \
python314-scikit-learn \
python314-scipy"

inherit rpm
