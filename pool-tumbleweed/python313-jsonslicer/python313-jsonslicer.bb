SUMMARY = "Streaming JSON parser with iterator interface"
DESCRIPTION = "JsonSlicer performs a stream or iterative, pull JSON parsing, which \
means it does not load whole JSON into memory and is able to parse \
very large JSON files or streams. The module is written in C and uses \
YAJL JSON parsing library. \
 \
JsonSlicer takes a path of JSON map keys or array indexes, and \
provides iterator interface which yields JSON data matching \
given path as complete Python objects."
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "python313-jsonslicer-0.1.8-2.7.aarch64.rpm"
RPM_HASH = "d3394e385d76cae5e5d32f91f6fc7725cc49c8760bc48d76974adb840039c05a4e50475830be9cceeb9edeb15d9e9443eddc35dcd8c5eaf21dac186d9c63973c"

RPROVIDES:${PN} += "python3-jsonslicer \
python3.13dist-jsonslicer \
python313-jsonslicer \
python3dist-jsonslicer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
