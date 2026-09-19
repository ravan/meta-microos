SUMMARY = "Development headers for libmsgpack C library"
DESCRIPTION = "MessagePack is a binary-based object serialization library. It enables to \
exchange structured objects between many languages like JSON. \
 \
This package provides headers and other devel files."
LICENSE = "BSL-1.0"

PV = "7.0.2"

RPM_NAME = "msgpack-c-devel-7.0.2-2.1.aarch64.rpm"
RPM_HASH = "cc2d59d4e0a56b695520f50c34132ee0dc3cb9f8bfe0f7647c4d09284b69483647c8d069d86e9a0dec933f60cbab3cf5022b8f7fd770376c27eda0f68e698624"

RPROVIDES:${PN} += "cmake-msgpack-c \
libmsgpack-devel \
libmsgpackc-devel \
msgpack-c-devel \
pkgconfig-msgpack-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmsgpack-c2"

inherit rpm
