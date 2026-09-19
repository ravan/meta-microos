SUMMARY = "Python binding for CRFsuite"
DESCRIPTION = "Python-crfsuite is a python binding to CRFsuite_."
LICENSE = "MIT"

PV = "0.9.12"

RPM_NAME = "python313-python-crfsuite-0.9.12-1.6.aarch64.rpm"
RPM_HASH = "87109d05e9d9b85e28356e2354cfbe2aa308c2419a70dafcff3cb07f2299f6b6d5502f09b657a2ebb52f39e9edc811bdd9105f0040ec452d5eb69f98fd658abc"

RPROVIDES:${PN} += "python3-python-crfsuite \
python3.13dist-python-crfsuite \
python313-python-crfsuite \
python3dist-python-crfsuite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
