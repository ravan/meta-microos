SUMMARY = "High-performance and extensible WebAssembly runtime"
DESCRIPTION = "WasmEdge is a lightweight, high-performance, and extensible WebAssembly runtime \
for cloud native, edge, and decentralized applications. It powers serverless \
apps, embedded functions, microservices, smart contracts, and IoT devices."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.1"

RPM_NAME = "wasmedge-0.16.1-2.5.aarch64.rpm"
RPM_HASH = "deb92ec24fa14fa6b0b8f0f9a70f8f1e0de696388de3f13f560675f128dfdee4553fad1fb1d3cb34c12a4acf756a327d684b26661101aecfbf082ec6236e0c6b"

RPROVIDES:${PN} += "wasmedge"

RDEPENDS:${PN} += "libc.so.6 \
libwasmedge.so.0"

inherit rpm
