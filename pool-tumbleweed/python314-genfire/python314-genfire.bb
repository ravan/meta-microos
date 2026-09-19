SUMMARY = "GENeralized Fourier Iterative REconstruction"
DESCRIPTION = "GENeralized Fourier Iterative REconstruction (GENFIRE) \
is a python package for 3D reconstruction from arbitrarily \
oriented projection images"
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "python314-genfire-1.1.11-7.5.noarch.rpm"
RPM_HASH = "6ade68f63f7cc23d44cff81b86636fdafc56ae1a1114a269a1e36850b3f86863037964722d52a44e003cefc58ecce3fa926d60cb574f673eee29bcf37bfa0faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-genfire \
python314-genfire \
python3dist-genfire"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Pillow \
python314-PyQt5 \
python314-numpy \
python314-pyFFTW \
python314-pyparsing \
python314-scipy \
python314-setuptools"

inherit rpm
