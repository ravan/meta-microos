SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.16.0"

RPM_NAME = "python314-python3-saml-1.16.0-2.5.noarch.rpm"
RPM_HASH = "69da8f9c7e2ba7406ed8a53f6b5527955434d4a64980b6935691b78b92a8ed2bcfbfd9d15a87bfd05132df298446254191a7ac30f1838f9d4ceb4139d92df31f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python3-saml \
python314-python3-saml \
python3dist-python3-saml"

RDEPENDS:${PN} += "libxmlsec1-openssl1 \
python-abi \
python314-isodate \
python314-lxml \
python314-xmlsec"

inherit rpm
