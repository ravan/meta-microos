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

RPM_NAME = "python313-gwpy-4.0.1-1.2.noarch.rpm"
RPM_HASH = "6e131f8b8e1db01b5951fd0f1aef1ce08cd20570c4a5faccc8172fb4fac871ac9f5f45bfe3439c52050ac3a1fe4ef14068f3fe8798171fa77c836e609e1483d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwpy \
python3.13dist-gwpy \
python313-gwpy \
python3dist-gwpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-astropy \
python313-dateparser \
python313-dqsegdb2 \
python313-gwdatafind \
python313-gwosc \
python313-h5py \
python313-igwn-ligolw \
python313-igwn-segments \
python313-ligotimegps \
python313-matplotlib \
python313-numpy \
python313-python-dateutil \
python313-requests \
python313-scipy \
python313-tqdm \
update-alternatives"

inherit rpm
