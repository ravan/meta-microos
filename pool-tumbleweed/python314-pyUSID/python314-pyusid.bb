SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.12"

RPM_NAME = "python314-pyUSID-0.0.12-6.2.noarch.rpm"
RPM_HASH = "e2e87b2d9414d75546e505eac4736167840ff788c5616ccf1e242827880466a8577fdaacd5228963d9e332aacd00fab13b8fbb3531ad299578a4ed763b5a5266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyusid \
python314-pyUSID \
python3dist-pyusid"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-cytoolz \
python314-dask \
python314-h5py \
python314-numpy \
python314-psutil \
python314-sidpy \
python314-toolz"

inherit rpm
