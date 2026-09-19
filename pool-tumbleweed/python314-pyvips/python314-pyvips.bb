SUMMARY = "Python bindings for VIPS image processing library"
DESCRIPTION = "This package contains the Python bindings for the VIPS library."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python314-pyvips-3.1.1-1.3.noarch.rpm"
RPM_HASH = "f12924f598689429c991948333064b7385bc15d5fd44bff8f77ba5bac6d7dfa1807a1b6110d5da84dab52f91bea8ee17e963cbc4f949087db030ee65745326c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyvips \
python314-pyvips \
python3dist-pyvips"

RDEPENDS:${PN} += "python-abi \
python314-cffi"

inherit rpm
