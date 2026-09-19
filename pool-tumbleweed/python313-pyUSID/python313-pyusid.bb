SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.12"

RPM_NAME = "python313-pyUSID-0.0.12-6.2.noarch.rpm"
RPM_HASH = "c86b7414f1b2b7909f99daffe7ff522ae6b1b80fe16d907b704abbc5f0ec9a0a4b319dd39a58b4687c5f2157eb8fd33f908f1753a20b002fb5ddd48c33fdee7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyUSID \
python3.13dist-pyusid \
python313-pyUSID \
python3dist-pyusid"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-cytoolz \
python313-dask \
python313-h5py \
python313-numpy \
python313-psutil \
python313-sidpy \
python313-toolz"

inherit rpm
