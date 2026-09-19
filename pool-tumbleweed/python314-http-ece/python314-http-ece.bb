SUMMARY = "Encrypted Content Encoding for HTTP"
DESCRIPTION = "Encrypted Content Encoding for HTTP."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python314-http-ece-1.2.1-1.3.noarch.rpm"
RPM_HASH = "adc02e69eb5552751b7af9155272cf15186b75a61c51055ac301197f52da9181d32f69c4f13d183883e5d5e7f059e36f2d0f083d21f92d36f4f844ad5a90ccc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-http-ece \
python314-http-ece \
python3dist-http-ece"

RDEPENDS:${PN} += "python-abi \
python314-cryptography"

inherit rpm
