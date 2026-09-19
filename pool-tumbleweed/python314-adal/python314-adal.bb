SUMMARY = "Azure Active Directory library"
DESCRIPTION = "The ADAL for Python library makes it easy for python application to authenticate to \
Azure Active Directory (AAD) in order to access AAD protected web resources."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python314-adal-1.2.7-4.9.noarch.rpm"
RPM_HASH = "b652ec507fdc9c7abda9d81985a09ce22db53ec3684a98d0eecd5ae32a2a651aa5f3f351b1f3185e2595510660ab1004e3c3fe09364e3e7289283201830fe8b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-adal \
python314-adal \
python3dist-adal"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-cryptography \
python314-python-dateutil \
python314-requests"

inherit rpm
