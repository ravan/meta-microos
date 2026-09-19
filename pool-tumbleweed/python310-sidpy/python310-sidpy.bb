SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.12.3"

RPM_NAME = "python310-sidpy-0.12.3-1.1.noarch.rpm"
RPM_HASH = "73daa9ca9b5e3feedde1c39ae2e5f3a5ecf5384d94f3ccfe48baac5b1aad3ad83c1617618fe08062868260b2cd0224cc93153cf6135b50e48524e47404cd4cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sidpy \
python310-sidpy \
python3dist-sidpy"

RDEPENDS:${PN} += "python-abi \
python310-ase \
python310-cytoolz \
python310-dask \
python310-dask-array \
python310-distributed \
python310-h5py \
python310-ipython \
python310-ipywidgets \
python310-joblib \
python310-matplotlib \
python310-numpy \
python310-psutil \
python310-scikit-learn \
python310-scipy \
python310-toolz"

inherit rpm
