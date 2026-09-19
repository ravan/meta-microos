SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.95.0"

RPM_NAME = "cargo1.95-1.95.0-1.4.aarch64.rpm"
RPM_HASH = "cd4c74b1649daff49bf7e487db5d7d618a6e70ac1b80021263469c9530fbb8609029f0b175777230c0cd67143126cb2c8fbacae0af67dc5090801bc4cc0545ca"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.95 \
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
