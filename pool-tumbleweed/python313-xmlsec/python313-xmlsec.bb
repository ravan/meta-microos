SUMMARY = "Python bindings for the XML Security Library"
DESCRIPTION = "Python bindings for the XML Security Library"
LICENSE = "MIT"

PV = "1.3.17"

RPM_NAME = "python313-xmlsec-1.3.17-1.5.aarch64.rpm"
RPM_HASH = "f9c3346b7f79c5cb65594e80e0251ad7d06424f72c604bfb46bb091e18fb73bdbdf484a94b108765e8438c7c2b2672f2e710fe437d14c9e103db4e5477e4c067"

RPROVIDES:${PN} += "python3-xmlsec \
python3.13dist-xmlsec \
python313-xmlsec \
python3dist-xmlsec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
libxmlsec1.so.1 \
python-abi \
python313-lxml"

inherit rpm
