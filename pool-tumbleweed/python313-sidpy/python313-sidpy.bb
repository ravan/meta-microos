SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.12.9"

RPM_NAME = "python313-sidpy-0.12.9-1.1.noarch.rpm"
RPM_HASH = "57d24a8e16cee1215dcf2e195a33e2d48bc9c7dc1b4111eedf19972a34159beb566bf321a24ed3f4058ee197d0147cdb118a477bf78ddc25e6801702c54a6b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sidpy \
python3.13dist-sidpy \
python313-sidpy \
python3dist-sidpy"

RDEPENDS:${PN} += "python-abi \
python313-ase \
python313-cytoolz \
python313-dask \
python313-dask-array \
python313-dask-ml \
python313-dill \
python313-distributed \
python313-h5py \
python313-ipykernel \
python313-ipympl \
python313-ipython \
python313-ipywidgets \
python313-joblib \
python313-matplotlib \
python313-numpy \
python313-pyswarms \
python313-scikit-learn \
python313-scipy \
python313-toolz"

inherit rpm
