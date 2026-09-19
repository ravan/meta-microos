SUMMARY = "Non-ABI stable API for the Qt 6 Protobuf Library"
DESCRIPTION = "This package provides private headers of libQt6Protobuf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-protobuf-private-devel-6.11.2-1.3.aarch64.rpm"
RPM_HASH = "f282b4c181a2c01edf1b85c7cc0062a8276280c81e0bedccc3cc4bc5c424e468247b7619541853fbb4ffb4a176c432e8ce0823d811adf1ba22a5533c5fbe75b4"

RPROVIDES:${PN} += "cmake-Qt6ProtobufPrivate \
cmake-Qt6ProtobufQtCoreTypesPrivate \
cmake-Qt6ProtobufQtGuiTypesPrivate \
cmake-Qt6ProtobufQuickPrivate \
cmake-Qt6ProtobufWellKnownTypesPrivate \
qt6-protobuf-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Protobuf"

inherit rpm
