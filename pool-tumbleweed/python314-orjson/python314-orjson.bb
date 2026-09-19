SUMMARY = "Fast, correct Python JSON library supporting dataclasses, datetimes, and numpy"
DESCRIPTION = "orjson is a fast JSON library for Python. \
It benchmarks as the fastest Python library for JSON."
LICENSE = "(Apache-2.0 | MIT) & MPL-2.0"

PV = "3.11.9"

RPM_NAME = "python314-orjson-3.11.9-1.4.aarch64.rpm"
RPM_HASH = "525f4e1817de9e78b34a1a69d7fb284be3e2b9e43724166e233e8382c9dd9445003d1688daf85d8eaa41e0be9d2c9e4616f3a310bb933ebb8e04a8e225bd7ed0"

RPROVIDES:${PN} += "python3.14dist-orjson \
python314-orjson \
python3dist-orjson"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
