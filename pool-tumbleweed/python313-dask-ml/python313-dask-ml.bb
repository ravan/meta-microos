SUMMARY = "A library for distributed and parallel machine learning"
DESCRIPTION = "Dask-ML provides scalable machine learning in Python using Dask alongside \
popular machine learning libraries like Scikit-Learn and XGBoost."
LICENSE = "BSD-3-Clause"

PV = "2025.1.0"

RPM_NAME = "python313-dask-ml-2025.1.0-1.1.noarch.rpm"
RPM_HASH = "14dde8e1aec0a7970fea380ec062174fb4ef2cdf5c67fda02bfc9b2084a98b408e88fcb80a3904df8209103d49fc8fa9670808d12ede7b44a655bb896462c4e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-ml \
python3.13dist-dask-ml \
python313-dask-ml \
python3dist-dask-ml"

RDEPENDS:${PN} += "python-abi \
python313-dask \
python313-dask-array \
python313-dask-dataframe \
python313-dask-glm \
python313-distributed \
python313-multipledispatch \
python313-numba \
python313-numpy \
python313-packaging \
python313-pandas \
python313-scikit-learn \
python313-scipy"

inherit rpm
