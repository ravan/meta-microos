SUMMARY = "Python control systems library"
DESCRIPTION = "The Python Control Systems Library is a Python module that implements basic \
operations for analysis and design of feedback control systems."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python313-control-0.10.2-1.6.noarch.rpm"
RPM_HASH = "0cfcd708a112c9f9a649b9ba2e16067ea8d1bb96c589616b05a8aa15fbf756f8b30c1729a1e972029dad4a7345c68994fd638ad8902a6a077dbf2a85bab3ad59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-control \
python3.13dist-control \
python313-control \
python3dist-control"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy \
python313-scipy"

inherit rpm
