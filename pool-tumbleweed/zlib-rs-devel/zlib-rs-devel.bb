SUMMARY = "Development files for zlib-rs"
DESCRIPTION = "zlib-rs is an implementation of the zlib compression algorithms written in \
Rust, exposing the standard zlib C API. \
 \
This package contains the files needed to build applications against it."
LICENSE = "Zlib"

PV = "0.6.7"

RPM_NAME = "zlib-rs-devel-0.6.7-1.2.aarch64.rpm"
RPM_HASH = "62feff50e9283e1c37b4b766f7cf7df95da241d7f1f81352e37d84e6cf58295e7bfd44541866a48025f286b7300e162de85c41c7f3d9086b9ec0a188fa1f5379"

RPROVIDES:${PN} += "pkgconfig-libz-rs \
zlib-rs-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz-rs1 \
pkgconfig-zlib"

inherit rpm
