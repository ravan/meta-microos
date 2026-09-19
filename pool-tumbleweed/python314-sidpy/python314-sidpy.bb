SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.12.9"

RPM_NAME = "python314-sidpy-0.12.9-1.1.noarch.rpm"
RPM_HASH = "28d5e48de405cc038de7cd1cc330747631d5a53dd8764382faf344204e30371c63bb0b389f18935a221aaaab52a0aed4d14b955637fc4a1ee27ea228b5422873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sidpy \
python314-sidpy \
python3dist-sidpy"

RDEPENDS:${PN} += "python-abi \
python314-ase \
python314-cytoolz \
python314-dask \
python314-dask-array \
python314-dask-ml \
python314-dill \
python314-distributed \
python314-h5py \
python314-ipykernel \
python314-ipympl \
python314-ipython \
python314-ipywidgets \
python314-joblib \
python314-matplotlib \
python314-numpy \
python314-pyswarms \
python314-scikit-learn \
python314-scipy \
python314-toolz"

inherit rpm
