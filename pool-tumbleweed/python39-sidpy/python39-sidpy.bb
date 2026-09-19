SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.12.3"

RPM_NAME = "python39-sidpy-0.12.3-1.1.noarch.rpm"
RPM_HASH = "74b8deba235be84d50a1085a6c61a6fe1d556ee16cb0dc62ffd0258875941502165a6f149e3f7c11a7ca9bd6db5dc2786fee56bd9b259d3cb247b3e6248016d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sidpy \
python39-sidpy \
python3dist-sidpy"

RDEPENDS:${PN} += "python-abi \
python39-ase \
python39-cytoolz \
python39-dask \
python39-dask-array \
python39-distributed \
python39-h5py \
python39-ipython \
python39-ipywidgets \
python39-joblib \
python39-matplotlib \
python39-numpy \
python39-psutil \
python39-scikit-learn \
python39-scipy \
python39-toolz"

inherit rpm
