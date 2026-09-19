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

RPM_NAME = "python39-gwpy-3.0.8-1.1.noarch.rpm"
RPM_HASH = "718841e6d9bd4233d4d7f315cde2f4b1fb4a0e7786254f1f879c5dce65390593124117cd28c22493c8f129de7c3852bc1fb7beaac7e54c070dc9c216614a23d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gwpy \
python39-gwpy \
python3dist-gwpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-astropy \
python39-dateparser \
python39-dqsegdb2 \
python39-gwdatafind \
python39-gwosc \
python39-h5py \
python39-ligo-segments \
python39-ligotimegps \
python39-matplotlib \
python39-numpy \
python39-python-dateutil \
python39-requests \
python39-scipy \
python39-tqdm \
update-alternatives"

inherit rpm
