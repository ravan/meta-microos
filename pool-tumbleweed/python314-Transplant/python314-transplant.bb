SUMMARY = "Python module for calling out to Matlab"
DESCRIPTION = "Transplant is a way of calling Matlab from Python. \
 \
Python lists are converted to cell arrays in Matlab, dicts are \
converted to Maps, and numpy ND-Arrays are converted to native \
Matlab matrices. \
 \
All Matlab functions and objects can be accessed from Python."
LICENSE = "BSD-3-Clause"

PV = "0.8.11"

RPM_NAME = "python314-Transplant-0.8.11-4.5.noarch.rpm"
RPM_HASH = "f07106aedc7b2636ff3c607f7b12234ea1968117fd93533a7a884e4cbbecc26a4739d047fae85d7c89f60d53de17b602dc1f9d8d465eb9c774a0f80b4a7c64c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-transplant \
python314-Transplant \
python3dist-transplant"

RDEPENDS:${PN} += "python-abi \
python314-msgpack-python \
python314-numpy \
python314-pyzmq"

inherit rpm
