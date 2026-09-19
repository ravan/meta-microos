SUMMARY = "GENeralized Fourier Iterative REconstruction"
DESCRIPTION = "GENeralized Fourier Iterative REconstruction (GENFIRE) \
is a python package for 3D reconstruction from arbitrarily \
oriented projection images"
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "python313-genfire-1.1.11-7.5.noarch.rpm"
RPM_HASH = "20c02c0e07a9f6d356fde36dc5bfc9b4f7e32776b7ebe7d1bd6c774a2275172ebcf095d07b3c7644f1d84bf9bb0f89b936bb3e5975bc46c0f59abe017deea9c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-genfire \
python3.13dist-genfire \
python313-genfire \
python3dist-genfire"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Pillow \
python313-PyQt5 \
python313-numpy \
python313-pyFFTW \
python313-pyparsing \
python313-scipy \
python313-setuptools"

inherit rpm
