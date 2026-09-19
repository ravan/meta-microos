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

RPM_NAME = "python310-gwpy-3.0.8-1.1.noarch.rpm"
RPM_HASH = "1558de9ab1bc37ae73278f2d7006a25f832772ea3f2ecdbe9d4bd15576dc40c7f8a30a917280ce8e0dc990bde318bf0a33379c1073f3630f6269078718375362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gwpy \
python310-gwpy \
python3dist-gwpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-astropy \
python310-dateparser \
python310-dqsegdb2 \
python310-gwdatafind \
python310-gwosc \
python310-h5py \
python310-ligo-segments \
python310-ligotimegps \
python310-matplotlib \
python310-numpy \
python310-python-dateutil \
python310-requests \
python310-scipy \
python310-tqdm \
update-alternatives"

inherit rpm
