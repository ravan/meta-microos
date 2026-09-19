SUMMARY = "Python extension for MurmurHash (MurmurHash3)"
DESCRIPTION = "Python extension for MurmurHash (MurmurHash3), a set of fast and robust hash functions."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "python313-mmh3-5.2.1-1.5.aarch64.rpm"
RPM_HASH = "a0f52b4b8c9046e80397878a91e0801f178976a9a22f9e3de983618be39bf0f9ce4ccfec413ffe7833c8af4b6ddadc2705ac1362a3be324964f6706eab5615aa"

RPROVIDES:${PN} += "python3-mmh3 \
python3.13dist-mmh3 \
python313-mmh3 \
python3dist-mmh3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
