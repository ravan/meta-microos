SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.1.1"

RPM_NAME = "python314-lxml-6.1.1-2.2.aarch64.rpm"
RPM_HASH = "6640757ecf4eed6d58260ed525bf727a19b79dc2138828c348a459e53128ddf2c0043b87c1b430b6ac690d55757dc7a4e49c656f2645a25741ff1f8e7e86b0ef"

RPROVIDES:${PN} += "python3.14dist-lxml \
python314-lxml \
python3dist-lxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.16 \
libxslt.so.1 \
python-abi \
python314-cssselect"

inherit rpm
