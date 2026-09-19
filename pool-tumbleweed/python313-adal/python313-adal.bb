SUMMARY = "Azure Active Directory library"
DESCRIPTION = "The ADAL for Python library makes it easy for python application to authenticate to \
Azure Active Directory (AAD) in order to access AAD protected web resources."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python313-adal-1.2.7-4.9.noarch.rpm"
RPM_HASH = "4ca9bd2ceed95a8d3552fea49e719ffadf9b3af8a2361aef4885e96941035f515e2e8b3aee5a33a994ef2d95d7725101cc034bbe5f8457c6a20ea9f6e6e4e7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-adal \
python3.13dist-adal \
python313-adal \
python3dist-adal"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-cryptography \
python313-python-dateutil \
python313-requests"

inherit rpm
