SUMMARY = "Library for decrypting MS Office files"
DESCRIPTION = "A Python tool and library for decrypting MS Office \
files with passwords or other keys."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python314-msoffcrypto-tool-6.0.0-1.3.noarch.rpm"
RPM_HASH = "e0d910776b88cbb632ce7e21548f2392bdea17f57c4b61709fbe2a7a3d430334626248adc016cc78d39d350131ec8d47cb745f62d301fa2111c4f899aea087fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-msoffcrypto-tool \
python314-msoffcrypto-tool \
python3dist-msoffcrypto-tool"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-cryptography \
python314-olefile \
update-alternatives"

inherit rpm
