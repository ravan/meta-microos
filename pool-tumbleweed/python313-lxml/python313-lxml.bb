SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.1.1"

RPM_NAME = "python313-lxml-6.1.1-2.2.aarch64.rpm"
RPM_HASH = "345437e788a2ae0284c18d67e1e48f69a9488476d30e4bdb21088575dbd8353119a0f780a331e5cba15e7587eb8d8b5302d0e1e582aa1db2140d00d8d20217cf"

RPROVIDES:${PN} += "python3-lxml \
python3.13dist-lxml \
python313-lxml \
python3dist-lxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.16 \
libxslt.so.1 \
python-abi \
python313-cssselect"

inherit rpm
