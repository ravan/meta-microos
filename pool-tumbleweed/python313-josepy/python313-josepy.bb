SUMMARY = "JOSE protocol implementation in Python"
DESCRIPTION = "JOSE protocol implementation in Python using cryptography. \
It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python313-josepy-2.2.0-1.4.noarch.rpm"
RPM_HASH = "ae981d2f5939d56f075e611bd4da04ae55df9e956ae4e3ce999f7ba4b58409060ddfe8eabc8f4c46b97294baf06d5879b5c815662ecbf0f8c7290feab424a39d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-josepy \
python3.13dist-josepy \
python313-josepy \
python3dist-josepy"

RDEPENDS:${PN} += "python-abi \
python313-cryptography"

inherit rpm
