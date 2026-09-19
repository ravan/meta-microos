SUMMARY = "JsonRpc 2.0 protocol implementation"
DESCRIPTION = "JsonRpc 2.0 protocol implementation for Qt6. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-jsonrpc-devel-static-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b07321f76767f8db4ecec78e30f163d2bf22bb60ed2e1244657b22722b90f8a1600f00fe8a328b58f5a6d790b2b3f97fc29446179ac5f8b8796a62e6a695e5ec"

RPROVIDES:${PN} += "cmake-Qt6JsonRpcPrivate \
qt6-jsonrpc-devel-static \
qt6-jsonrpc-private-devel"

RDEPENDS:${PN} += ""

inherit rpm
