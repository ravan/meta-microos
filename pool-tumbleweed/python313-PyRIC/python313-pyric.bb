SUMMARY = "Python Wireless Library"
DESCRIPTION = "PyRIC is a (Linux-only) library providing wireless developers and pentesters the \
ability to identify, enumerate and manipulate their system's wireless cards \
programmatically in Python."
LICENSE = "GPL-3.0-only"

PV = "0.1.6.3"

RPM_NAME = "python313-PyRIC-0.1.6.3-4.5.noarch.rpm"
RPM_HASH = "59a24a49c43f44cda15cc15b9a3ed58fbf3b9a0b2d1d34b1da455c8018ec58bf2da63b0dca0ddbb15ace01e84d2163589a8818b83757cff6dba12bd74edd7a9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyRIC \
python3.13dist-pyric \
python313-PyRIC \
python3dist-pyric"

RDEPENDS:${PN} += "python-abi"

inherit rpm
