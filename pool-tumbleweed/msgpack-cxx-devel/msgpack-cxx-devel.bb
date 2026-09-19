SUMMARY = "Development headers for libmsgpack C++ library"
DESCRIPTION = "MessagePack is a binary-based object serialization library. It enables to \
exchange structured objects between many languages like JSON. \
 \
This package provides C++ headers and other devel files."
LICENSE = "BSL-1.0"

PV = "9.0.0"

RPM_NAME = "msgpack-cxx-devel-9.0.0-1.1.aarch64.rpm"
RPM_HASH = "18506601bd0e0627f92a9752f3584911518082c9a694d7586770e3ae2b59f10d970145ef0b81a77ddb8d689693fc1a4172d6260f8c175e37b450de705170385c"

RPROVIDES:${PN} += "cmake-msgpack-cxx \
libmsgpack-devel \
msgpack-cxx-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
msgpack-c-devel"

inherit rpm
