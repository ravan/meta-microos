SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.36.0"

RPM_NAME = "python313-OWSLib-0.36.0-1.1.noarch.rpm"
RPM_HASH = "85b4ad92fa674015f48ef831373fb3253f4cbfa5f6b89454de0ffe1f190d9d38e956b24d548555251b702d1304c540641598e84c61620bb26fd30045c5b874c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-OWSLib \
python3-owslib \
python3.13dist-owslib \
python313-OWSLib \
python313-owslib \
python3dist-owslib"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-lxml \
python313-python-dateutil \
python313-requests"

inherit rpm
