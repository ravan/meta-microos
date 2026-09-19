SUMMARY = "A script to generate Sphinx ReST from Doxygen XML"
DESCRIPTION = "Sphinxygen is a Python module/script that generates Sphinx markup to describe a C API, from an XML description extracted by Doxygen."
LICENSE = "ISC"

PV = "1.0.12"

RPM_NAME = "python313-sphinxygen-1.0.12-1.1.noarch.rpm"
RPM_HASH = "2fca38b1366083d1d57c285014b0f559ff1ac5595518927abef927d949dd879d18912f1bab1ed20369dfde03b8c6d9fe3a2acaec27c874f0bda977e130b17947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxygen \
python3.13dist-sphinxygen \
python313-sphinxygen \
python3dist-sphinxygen"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
