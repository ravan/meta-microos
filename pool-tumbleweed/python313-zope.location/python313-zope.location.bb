SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, location are special objects that has a structural location."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python313-zope.location-6.0-1.4.noarch.rpm"
RPM_HASH = "735b975c3c1c5745ce0164bf9d3de49c7c042187480d579e026ad53feade6d31a5d8bf58010bd37087439d94b006464bb29b4d4e7298b49de6d3cb4d22c05422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.location \
python3.13dist-zope.location \
python313-zope.location \
python3dist-zope.location"

RDEPENDS:${PN} += "python-abi \
python313-setuptools \
python313-zope.interface \
python313-zope.proxy \
python313-zope.schema"

inherit rpm
