SUMMARY = "Pybind11 bindings for Protocol Buffers"
DESCRIPTION = "These adapters make Protocol Buffer message types work with Pybind11 bindings."
LICENSE = "BSD-3-Clause"

PV = "0~git20250210.f02a2b7"

RPM_NAME = "pybind11_protobuf-0~git20250210.f02a2b7-1.4.aarch64.rpm"
RPM_HASH = "8727f68aa5b30ea2536160fcc7b35d02d25fdba668db12f4042ee82c31850cf47fd90e36f47cdd75b914ff328c125ef4f5324e0ce678ccd27627a0f7d8c1a1a7"

RPROVIDES:${PN} += "pybind11-protobuf"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
