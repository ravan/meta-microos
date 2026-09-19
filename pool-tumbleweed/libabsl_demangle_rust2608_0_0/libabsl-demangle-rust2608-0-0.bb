SUMMARY = "Abseil library liblibabsl_demangle_rust"
DESCRIPTION = "This package contains the libabsl_demangle_rust library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_demangle_rust2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "3012a584fbf239c2d088383f6bbb2dfd40c542e8821346d25ef5cb1d85a74484f11239e5f0eed0dfce9a02726266f1d1a3850d7f6497062ef77e75fcd4c8334d"

RPROVIDES:${PN} += "libabsl-demangle-rust.so.2608.0.0 \
libabsl-demangle-rust2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-decode-rust-punycode.so.2608.0.0 \
libc.so.6"

inherit rpm
