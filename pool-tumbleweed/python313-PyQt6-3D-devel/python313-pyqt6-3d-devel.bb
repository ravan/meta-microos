SUMMARY = "Devel files for python313-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python313-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-3D-devel-6.11.0-1.5.aarch64.rpm"
RPM_HASH = "caeb9002dc050e1338007c706c8962817f96f288ffa044919c9d8751f49d6935a9b961c888609e9b5a26cdd5f182c51e3a63ee0d49fa55dcc66c9bba56cc9303"

RPROVIDES:${PN} += "python3-PyQt6-3D-devel \
python313-PyQt6-3D-devel"

RDEPENDS:${PN} += "python-abi \
python313-PyQt6-devel"

inherit rpm
