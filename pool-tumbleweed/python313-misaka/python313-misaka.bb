SUMMARY = "A CFFI binding for Hoedown, a markdown parsing library"
DESCRIPTION = "A CFFI binding for Hoedown_ (version 3), a markdown parsing library."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python313-misaka-2.1.1-4.7.aarch64.rpm"
RPM_HASH = "a5ce7227e772e92edce8921fa9b3e1bb5e4b3140d0a91fb2118fa95ef6e8d37aa53512c5f2da696fc2e625f2d919e8957e6be79f0856271e6a1b1ac5b49690cd"

RPROVIDES:${PN} += "python3-misaka \
python3.13dist-misaka \
python313-misaka \
python3dist-misaka"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-cffi"

inherit rpm
