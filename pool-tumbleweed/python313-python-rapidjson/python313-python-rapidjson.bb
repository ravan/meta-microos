SUMMARY = "Python wrapper around rapidjson"
DESCRIPTION = "RapidJSON is a C++ JSON parser and serialization library. This \
module wraps it into a Python 3 extension, exposing its \
serialization/deserialization (to/from either bytes, str or file-like \
instances) and JSON Schema validation capabilities."
LICENSE = "MIT"

PV = "1.23"

RPM_NAME = "python313-python-rapidjson-1.23-1.4.aarch64.rpm"
RPM_HASH = "dd7911eac45a370d93318b00a9df70d13fb356c15691beb2be7f8557e88db4eb46ddd46d4efb12b75ca0fb02845f8faeeb5a5d1f1a3901fa31a75d489d3af66f"

RPROVIDES:${PN} += "python3-python-rapidjson \
python3.13dist-python-rapidjson \
python313-python-rapidjson \
python3dist-python-rapidjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
