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

RPM_NAME = "python314-jsonslicer-0.1.8-2.7.aarch64.rpm"
RPM_HASH = "61d7dcf79aae30767c35a64f8753f459f86213fcfc19a04da8d8636364e13a608937beb9675e60f211d4f9a08740d6132d6593c3d6afe9e94c3960d12488d4a4"

RPROVIDES:${PN} += "python3.14dist-jsonslicer \
python314-jsonslicer \
python3dist-jsonslicer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
