SUMMARY = "A python package for gravitational-wave astrophysics"
DESCRIPTION = "GWpy is a collaboration-driven Python package providing tools for \
studying data from ground-based gravitational-wave detectors. \
 \
GWpy provides a user-friendly, intuitive interface to the common \
time-domain and frequency-domain data produced by the LIGO and Virgo \
observatories and their analyses, with easy-to-follow tutorials at each \
step."
LICENSE = "GPL-3.0-only"

PV = "4.0.1"

RPM_NAME = "python314-gwpy-4.0.1-1.2.noarch.rpm"
RPM_HASH = "6866e2ba75b6750476c7ff51f86a567bc29bfcd6adfa729713177728e7e7749987053f4e8f78b11c24839f7362b7268a54c490cb1507fcf077ccb6d3d213d166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gwpy \
python314-gwpy \
python3dist-gwpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-astropy \
python314-dateparser \
python314-dqsegdb2 \
python314-gwdatafind \
python314-gwosc \
python314-h5py \
python314-igwn-ligolw \
python314-igwn-segments \
python314-ligotimegps \
python314-matplotlib \
python314-numpy \
python314-python-dateutil \
python314-requests \
python314-scipy \
python314-tqdm \
update-alternatives"

inherit rpm
