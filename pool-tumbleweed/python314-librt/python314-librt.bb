SUMMARY = "Mypyc runtime library"
DESCRIPTION = "Mypyc runtime library"
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python314-librt-0.15.0-1.1.aarch64.rpm"
RPM_HASH = "19b7bb82b2371682ce651744c2e203e57d8a5dd29218bce4267c90f810e9ce492b8e3c96b97f8af662877e0de5d6ef68110695e083bca5bc2ff2519b4f7d3409"

RPROVIDES:${PN} += "python3.14dist-librt \
python314-librt \
python3dist-librt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
