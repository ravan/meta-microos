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

RPM_NAME = "python313-Transplant-0.8.11-4.5.noarch.rpm"
RPM_HASH = "3c772a8c5d869f19c1eb39fb35890e1fd598f60caa57f3897781bf1d96d1c5218dfbfafb22d21957c3cb825f812a01ecf11d7de0a9f00004dfbb59889d1c38e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Transplant \
python3.13dist-transplant \
python313-Transplant \
python3dist-transplant"

RDEPENDS:${PN} += "python-abi \
python313-msgpack-python \
python313-numpy \
python313-pyzmq"

inherit rpm
