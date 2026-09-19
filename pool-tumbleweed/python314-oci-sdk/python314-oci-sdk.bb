SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.180.0"

RPM_NAME = "python314-oci-sdk-2.180.0-1.2.noarch.rpm"
RPM_HASH = "859fdba877537cb248cce0afa5c7dc704ad34fee001026d77d98817f3249a36313ef2c45cfa801fe410ca9dce72687215d870cf4631332686f9bf7e08cb620aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oci \
python314-oci \
python314-oci-sdk \
python3dist-oci"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-certifi \
python314-circuitbreaker \
python314-crc32c \
python314-cryptography \
python314-httpsig-cffi \
python314-pyOpenSSL \
python314-python-dateutil \
python314-pytz \
python314-requests \
python314-six \
python314-sseclient \
python314-urllib3"

inherit rpm
