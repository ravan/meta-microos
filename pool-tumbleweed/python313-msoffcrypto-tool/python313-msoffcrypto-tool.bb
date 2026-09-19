SUMMARY = "Library for decrypting MS Office files"
DESCRIPTION = "A Python tool and library for decrypting MS Office \
files with passwords or other keys."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python313-msoffcrypto-tool-6.0.0-1.3.noarch.rpm"
RPM_HASH = "c3d2b008780be6f75fb6f9074fc6dac4ce314ac9914b37f1e52d4e4e79a7288e71d4fa557e2b91ff48bee64e1c65e7dace511ddb5f67a70836e8ec91831605fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msoffcrypto-tool \
python3.13dist-msoffcrypto-tool \
python313-msoffcrypto-tool \
python3dist-msoffcrypto-tool"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-cryptography \
python313-olefile \
update-alternatives"

inherit rpm
