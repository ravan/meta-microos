SUMMARY = "Encrypted Content Encoding for HTTP"
DESCRIPTION = "Encrypted Content Encoding for HTTP."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python313-http-ece-1.2.1-1.3.noarch.rpm"
RPM_HASH = "64bb30a11c4b371a52b64167425158c4b9baeb80d9933255abfca7426699950196c20dc74e2d612c857e399093b5bcbccc86ecc219e454758dbf192896d7ddce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-http-ece \
python3.13dist-http-ece \
python313-http-ece \
python3dist-http-ece"

RDEPENDS:${PN} += "python-abi \
python313-cryptography"

inherit rpm
