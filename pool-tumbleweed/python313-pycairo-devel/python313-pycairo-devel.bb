SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.29.1"

RPM_NAME = "python313-pycairo-devel-1.29.1-1.1.aarch64.rpm"
RPM_HASH = "955b9505ee521349bdebf8f0dcfa462d6d22343b20602359524468b2bb19dbd05c393c4945318518a16b83d53e506a47e91f698a305c421d963bdc74305ebd6c"

RPROVIDES:${PN} += "python3-cairo-devel \
python3-pycairo-devel \
python313-cairo-devel \
python313-pycairo-devel"

RDEPENDS:${PN} += "python313-devel \
python313-pycairo \
python313-pycairo-common-devel"

inherit rpm
