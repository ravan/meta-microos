SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.180.0"

RPM_NAME = "python313-oci-sdk-2.180.0-1.2.noarch.rpm"
RPM_HASH = "15ab77358223db80c29708951455510bde2ed935d932fb34e35b8abd529f1a921ac92046fd892181034127d34a3a79c5d793a70b8d0bbf74f6c179cad108a535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oci \
python3-oci-sdk \
python3.13dist-oci \
python313-oci \
python313-oci-sdk \
python3dist-oci"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-certifi \
python313-circuitbreaker \
python313-crc32c \
python313-cryptography \
python313-httpsig-cffi \
python313-pyOpenSSL \
python313-python-dateutil \
python313-pytz \
python313-requests \
python313-six \
python313-sseclient \
python313-urllib3"

inherit rpm
