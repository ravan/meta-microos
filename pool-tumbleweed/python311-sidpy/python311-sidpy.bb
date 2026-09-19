SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.12.3"

RPM_NAME = "python311-sidpy-0.12.3-1.1.noarch.rpm"
RPM_HASH = "b085e45b65e1334ab09443831763b9ac453bb21c70e94af399ee0a2f902f8e579552f07038515997aa4049a08f47f4d00275fda0c3bb1b87d1011ce79ef2e4a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sidpy \
python3.11dist-sidpy \
python311-sidpy \
python3dist-sidpy"

RDEPENDS:${PN} += "python-abi \
python311-ase \
python311-cytoolz \
python311-dask \
python311-dask-array \
python311-distributed \
python311-h5py \
python311-ipython \
python311-ipywidgets \
python311-joblib \
python311-matplotlib \
python311-numpy \
python311-psutil \
python311-scikit-learn \
python311-scipy \
python311-toolz"

inherit rpm
