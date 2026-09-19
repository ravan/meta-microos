SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.12"

RPM_NAME = "python311-pyUSID-0.0.12-1.1.noarch.rpm"
RPM_HASH = "7db9110626844273e558681147c72aa46a6d1d8792974511c3a81ac800ebcd71e8e01ce992b6e52b8ed223ff7acfd00d7285cf0400e32f6ce920520710aea192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyUSID \
python3.11dist-pyusid \
python311-pyUSID \
python3dist-pyusid"

RDEPENDS:${PN} += "python-abi \
python311-Pillow \
python311-cytoolz \
python311-dask \
python311-h5py \
python311-numpy \
python311-psutil \
python311-sidpy \
python311-toolz"

inherit rpm
