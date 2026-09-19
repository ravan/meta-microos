SUMMARY = "Python Wireless Library"
DESCRIPTION = "PyRIC is a (Linux-only) library providing wireless developers and pentesters the \
ability to identify, enumerate and manipulate their system's wireless cards \
programmatically in Python."
LICENSE = "GPL-3.0-only"

PV = "0.1.6.3"

RPM_NAME = "python314-PyRIC-0.1.6.3-4.5.noarch.rpm"
RPM_HASH = "65843ebc35d029ea2b978f42af1f6f54b1a7a93c347d5d8232c74a19afad72e68c813245be50e31d2c13467c92e5ef0ac6d744be0e12f4a23269f545f428beb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyric \
python314-PyRIC \
python3dist-pyric"

RDEPENDS:${PN} += "python-abi"

inherit rpm
