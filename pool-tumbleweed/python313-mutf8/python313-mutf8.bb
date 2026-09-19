SUMMARY = "Python/C encoders/decoders for MUTF-8/CESU-8"
DESCRIPTION = "Pure-python and optional C encoders/decoders for MUTF-8/CESU-8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-mutf8-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "6675649c8865f5554347d1dfc93983f817b7fb39c09b78b0938d587af4cf4e2a62e81a594cce8f47efe852649a9e604426a5ab0221cc9e11503fdd23b4e58b67"

RPROVIDES:${PN} += "python3-mutf8 \
python3.13dist-mutf8 \
python313-mutf8 \
python3dist-mutf8"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
