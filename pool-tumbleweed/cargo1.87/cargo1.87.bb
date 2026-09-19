SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.87.0"

RPM_NAME = "cargo1.87-1.87.0-3.6.aarch64.rpm"
RPM_HASH = "aeb327ae079596666553e6a25318a836f44f1ea87aa2df9b699b6691422706cd79cc30c9e49c6c5f1a96cd4e6007e004940c042da366609112c0b4eb9cdfcdff"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.87 \
rust+cargo"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1 \
rust-std"

inherit rpm
