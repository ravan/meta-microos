SUMMARY = "Library and utility to support 7zip"
DESCRIPTION = "py7zr is a library and utility to support 7zip archive compression, decompression, encryption and decryption written by Python programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.3"

RPM_NAME = "python313-py7zr-1.1.3-1.2.noarch.rpm"
RPM_HASH = "d5acef39a32acaf997babed21d86b9eda055248f4e6438e6d5c44325d4c9b755d5e460f5aa8785bdc2ba1943b856ffaf10b241ea5c119703eb98b9332843db06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py7zr \
python3.13dist-py7zr \
python313-py7zr \
python3dist-py7zr"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Brotli \
python313-backports.zstd \
python313-inflate64 \
python313-multivolumefile \
python313-psutil \
python313-pybcj \
python313-pycryptodomex \
python313-pyppmd \
python313-texttable \
update-alternatives"

inherit rpm
