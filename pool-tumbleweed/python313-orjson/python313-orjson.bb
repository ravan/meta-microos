SUMMARY = "Fast, correct Python JSON library supporting dataclasses, datetimes, and numpy"
DESCRIPTION = "orjson is a fast JSON library for Python. \
It benchmarks as the fastest Python library for JSON."
LICENSE = "(Apache-2.0 | MIT) & MPL-2.0"

PV = "3.11.9"

RPM_NAME = "python313-orjson-3.11.9-1.4.aarch64.rpm"
RPM_HASH = "52121928b8c08f76646c41573ba6b6eeb856622296efc0509237ea1f9adab59b597bffe4ca90ca8b6aa30deb4f8d5d7238b5172dd0f6695dcffef5cf4e938d26"

RPROVIDES:${PN} += "python3-orjson \
python3.13dist-orjson \
python313-orjson \
python3dist-orjson"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
