SUMMARY = "Python/C encoders/decoders for MUTF-8/CESU-8"
DESCRIPTION = "Pure-python and optional C encoders/decoders for MUTF-8/CESU-8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-mutf8-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "471bd7e0775c65b714e4a46f92bb084717650a24ca7e9d2e3448e1226778d4a1f0ced25d8dab26c95c943bd04c22c3174cdd8f6e7e09f706fe0d5a8986fae8f8"

RPROVIDES:${PN} += "python3.14dist-mutf8 \
python314-mutf8 \
python3dist-mutf8"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
