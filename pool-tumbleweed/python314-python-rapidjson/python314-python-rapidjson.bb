SUMMARY = "Python wrapper around rapidjson"
DESCRIPTION = "RapidJSON is a C++ JSON parser and serialization library. This \
module wraps it into a Python 3 extension, exposing its \
serialization/deserialization (to/from either bytes, str or file-like \
instances) and JSON Schema validation capabilities."
LICENSE = "MIT"

PV = "1.23"

RPM_NAME = "python314-python-rapidjson-1.23-1.4.aarch64.rpm"
RPM_HASH = "30f14942cc1fbe832fac8e1a30de9776762b4949b91d9b899da58df245253f6187c325e9abb40f06497aedf08b7bc5e17ee426db85812fa4291bf2a13afc3df9"

RPROVIDES:${PN} += "python3.14dist-python-rapidjson \
python314-python-rapidjson \
python3dist-python-rapidjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
