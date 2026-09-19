SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.16.0"

RPM_NAME = "python313-python3-saml-1.16.0-2.5.noarch.rpm"
RPM_HASH = "781f76accbbed5e92415a1bd490ae548128c2857d4bd0c972a1773711a3dfe10e71336e52c74eb6d340843c9c972a81b38848c183135304360bc00c3d43cbeeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python3-saml \
python3.13dist-python3-saml \
python313-python3-saml \
python3dist-python3-saml"

RDEPENDS:${PN} += "libxmlsec1-openssl1 \
python-abi \
python313-isodate \
python313-lxml \
python313-xmlsec"

inherit rpm
