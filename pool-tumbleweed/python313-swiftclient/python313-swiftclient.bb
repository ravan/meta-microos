SUMMARY = "OpenStack Object Storage API Client Library"
DESCRIPTION = "This is a python client for the Swift API. There's a Python API (the \
swiftclient module), and a command-line script (swift)."
LICENSE = "Apache-2.0"

PV = "4.10.0"

RPM_NAME = "python313-swiftclient-4.10.0-1.3.noarch.rpm"
RPM_HASH = "7477a4c9eac6fec9267157621ef61b585863819bf8d2a0e9221591e886ffe51c3f103f0b4d815ea7fe21603d020b543b2e09e4e8f312c184f7e96fe1dc9fc44a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swiftclient \
python3.13dist-python-swiftclient \
python313-swiftclient \
python3dist-python-swiftclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-requests"

inherit rpm
