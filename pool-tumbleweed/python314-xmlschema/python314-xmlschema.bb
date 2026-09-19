SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "python314-xmlschema-4.3.2-1.2.noarch.rpm"
RPM_HASH = "d888201f3671ced1016e37231fb3ec6faa84b74448018d13a9fd5c21e65b06041dc7a49e0ea3f714cfedb8abf6c45550a29993dd082e2d894dd877899deecd5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xmlschema \
python314-xmlschema \
python3dist-xmlschema"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-elementpath \
python314-lxml"

inherit rpm
