SUMMARY = "Python control systems library"
DESCRIPTION = "The Python Control Systems Library is a Python module that implements basic \
operations for analysis and design of feedback control systems."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python314-control-0.10.2-1.6.noarch.rpm"
RPM_HASH = "8d1b06b7bb5d0d4db0ae8033dea0b43f2d5789c7460c4c0958b163a51b696f6f27a44cd520c4e8ba840d74c09140a8c506b24033a79de713ad76880e0e5bcfb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-control \
python314-control \
python3dist-control"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy \
python314-scipy"

inherit rpm
