SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, location are special objects that has a structural location."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python314-zope.location-6.0-1.4.noarch.rpm"
RPM_HASH = "cf095e156340010cf312e502eac34a105035016d5e4d05475b8d1cad997694c7b64e4a40e44b0e60dec45a7397c2359c4545193c26201bf2bc4f85c2423bc863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.location \
python314-zope.location \
python3dist-zope.location"

RDEPENDS:${PN} += "python-abi \
python314-setuptools \
python314-zope.interface \
python314-zope.proxy \
python314-zope.schema"

inherit rpm
