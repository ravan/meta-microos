SUMMARY = "Python bindings for the XML Security Library"
DESCRIPTION = "Python bindings for the XML Security Library"
LICENSE = "MIT"

PV = "1.3.17"

RPM_NAME = "python314-xmlsec-1.3.17-1.5.aarch64.rpm"
RPM_HASH = "3cf69c9c60c6fa7fda44bdc79cc26cf1491d07410eb0c3002077fabb3cd856ac8d3957fd49b94525afeebfbbd23f6fff211c70203b81a1507fd914a4b3d11956"

RPROVIDES:${PN} += "python3.14dist-xmlsec \
python314-xmlsec \
python3dist-xmlsec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
libxmlsec1.so.1 \
python-abi \
python314-lxml"

inherit rpm
