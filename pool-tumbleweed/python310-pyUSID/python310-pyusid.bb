SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.12"

RPM_NAME = "python310-pyUSID-0.0.12-1.1.noarch.rpm"
RPM_HASH = "e4b43fe76507347258569126d01a3dd5ccee083f4f53f5f80f0e1468f91320c8c35f22bf5b0dde0eaba9d2a39fd65018b670ebe390c3ec327dc1937dd4aa803c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyusid \
python310-pyUSID \
python3dist-pyusid"

RDEPENDS:${PN} += "python-abi \
python310-Pillow \
python310-cytoolz \
python310-dask \
python310-h5py \
python310-numpy \
python310-psutil \
python310-sidpy \
python310-toolz"

inherit rpm
