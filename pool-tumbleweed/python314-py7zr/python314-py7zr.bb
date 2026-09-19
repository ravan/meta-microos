SUMMARY = "Library and utility to support 7zip"
DESCRIPTION = "py7zr is a library and utility to support 7zip archive compression, decompression, encryption and decryption written by Python programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.3"

RPM_NAME = "python314-py7zr-1.1.3-1.2.noarch.rpm"
RPM_HASH = "4842015f91ef0fadf24d24ea52ecaefa9c692a73afe066881b1f2893ba93729d90e5d9142f0b29b0f0880908cd2fe744ce6d4fc07c27ec6c7f4258c1fbe8905e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py7zr \
python314-py7zr \
python3dist-py7zr"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Brotli \
python314-inflate64 \
python314-multivolumefile \
python314-psutil \
python314-pybcj \
python314-pycryptodomex \
python314-pyppmd \
python314-texttable \
update-alternatives"

inherit rpm
