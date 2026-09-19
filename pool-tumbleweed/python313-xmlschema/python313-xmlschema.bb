SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "python313-xmlschema-4.3.2-1.2.noarch.rpm"
RPM_HASH = "861a0ba3d0c5052da1c97c616d87f5d310467d9b0bfdd99e2dca74ca0e5884d089e5333350caa802f55be1142e11fbb4352538b9fa3c8d3944d6f4e44f0b7b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmlschema \
python3.13dist-xmlschema \
python313-xmlschema \
python3dist-xmlschema"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-elementpath \
python313-lxml"

inherit rpm
