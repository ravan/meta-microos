SUMMARY = "Python bindings for VIPS image processing library"
DESCRIPTION = "This package contains the Python bindings for the VIPS library."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python313-pyvips-3.1.1-1.3.noarch.rpm"
RPM_HASH = "59c86224669b3f203e9be08d412a75d50a5ba1a70fea82a51cd05253a6d57daedc3b6e484722ea0c5964abcadf340d538d1d61b5a115cbe098ba4fb13f70f29e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyvips \
python3.13dist-pyvips \
python313-pyvips \
python3dist-pyvips"

RDEPENDS:${PN} += "python-abi \
python313-cffi"

inherit rpm
