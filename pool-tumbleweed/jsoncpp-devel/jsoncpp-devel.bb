SUMMARY = "Development files for jsoncpp"
DESCRIPTION = "JSON is a lightweight data-interchange format. It can represent numbers, \
strings, ordered sequences of values, and collections of name/value pairs. \
 \
JsonCpp is a C++ library that allows manipulating JSON values, including \
serialization and deserialization to and from strings. It can also preserve \
existing comment in unserialization/serialization steps, making it a convenient \
format to store user input files."
LICENSE = "MIT"

PV = "1.9.8"

RPM_NAME = "jsoncpp-devel-1.9.8-2.3.aarch64.rpm"
RPM_HASH = "deadb176cdcbb4f6c59b93d5e4b9959d21da7d0ea9d95cd03c4c8ebe2ea652b0f6642139498027cc76660752eea452ee86a5826116ab9e4020f98c388d8272c6"

RPROVIDES:${PN} += "cmake-jsoncpp \
jsoncpp-devel \
pkgconfig-jsoncpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjsoncpp27"

inherit rpm
