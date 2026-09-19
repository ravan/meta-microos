SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.12"

RPM_NAME = "python39-pyUSID-0.0.12-1.1.noarch.rpm"
RPM_HASH = "67828729969ce4af8c4584b7decff50bc29ee7df03aade79f12e690581797a63385c2ddde4083ea91612be5393dad0e34c0c07992023662edd0aaad306383bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyusid \
python39-pyUSID \
python3dist-pyusid"

RDEPENDS:${PN} += "python-abi \
python39-Pillow \
python39-cytoolz \
python39-dask \
python39-h5py \
python39-numpy \
python39-psutil \
python39-sidpy \
python39-toolz"

inherit rpm
