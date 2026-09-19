SUMMARY = "Shared library for jsoncpp"
DESCRIPTION = "JSON is a lightweight data-interchange format. It can represent numbers, \
strings, ordered sequences of values, and collections of name/value pairs. \
 \
JsonCpp is a C++ library that allows manipulating JSON values, including \
serialization and deserialization to and from strings. It can also preserve \
existing comment in unserialization/serialization steps, making it a convenient \
format to store user input files."
LICENSE = "MIT"

PV = "1.9.8"

RPM_NAME = "libjsoncpp27-1.9.8-2.3.aarch64.rpm"
RPM_HASH = "6a165720a746ce592a4f453e33a5fab8447d3badb8fc086da4b82aafcc47768122fd83aa98d8fea42039322392f74b2ed3471f739dfe5dc063bbe0f1ffb9b52b"

RPROVIDES:${PN} += "libjsoncpp.so.27 \
libjsoncpp27"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
