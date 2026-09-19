SUMMARY = "Development headers for the Cap'n Proto C++ Library"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system. \
 \
This package provides development headers for capnproto."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libcapnp-devel-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "9e92c4f1adc81303472c3cc60d30341b10ddd184a317cedad0c849e4426e0bc81a6534912025b42bc1a4141c34bf3f4c736e7714c0ef57dd82c91648d65de831"

RPROVIDES:${PN} += "cmake-CapnProto \
libcapnp-devel \
pkgconfig-capnp \
pkgconfig-capnp-json \
pkgconfig-capnp-rpc \
pkgconfig-capnp-websocket \
pkgconfig-capnpc \
pkgconfig-kj \
pkgconfig-kj-async \
pkgconfig-kj-gzip \
pkgconfig-kj-http \
pkgconfig-kj-test \
pkgconfig-kj-tls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcapnp-1-5-0"

inherit rpm
