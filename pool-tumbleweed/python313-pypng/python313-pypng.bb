SUMMARY = "Pure Python PNG image encoder/decoder"
DESCRIPTION = "PyPNG allows PNG image files to be read and written using pure Python."
LICENSE = "MIT"

PV = "0.20220715.0"

RPM_NAME = "python313-pypng-0.20220715.0-1.13.noarch.rpm"
RPM_HASH = "d6fefeb4f7b105288d578a1736d5a2f8dd2659bac3f25e773433b99f7144881d80af69c42fd01e15e5d7259f08b21c4864d537aaa82b30a6e4a6fec2699d5f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypng \
python3.13dist-pypng \
python313-pypng \
python3dist-pypng"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
