SUMMARY = "A python package for gravitational-wave astrophysics"
DESCRIPTION = "GWpy is a collaboration-driven Python package providing tools for \
studying data from ground-based gravitational-wave detectors. \
 \
GWpy provides a user-friendly, intuitive interface to the common \
time-domain and frequency-domain data produced by the LIGO and Virgo \
observatories and their analyses, with easy-to-follow tutorials at each \
step."
LICENSE = "GPL-3.0-only"

PV = "3.0.8"

RPM_NAME = "python311-gwpy-3.0.8-1.1.noarch.rpm"
RPM_HASH = "cf0003467d12066945f20577228298360ffd3d1e6550551132ef6a886c050d052dd0d5f84a8a00225f116d47b1220206d59d3578e81b35d832b493dd2dd82f07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwpy \
python3.11dist-gwpy \
python311-gwpy \
python3dist-gwpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-astropy \
python311-dateparser \
python311-dqsegdb2 \
python311-gwdatafind \
python311-gwosc \
python311-h5py \
python311-ligo-segments \
python311-ligotimegps \
python311-matplotlib \
python311-numpy \
python311-python-dateutil \
python311-requests \
python311-scipy \
python311-tqdm \
update-alternatives"

inherit rpm
