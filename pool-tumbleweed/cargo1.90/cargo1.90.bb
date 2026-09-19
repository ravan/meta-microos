SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.90.0"

RPM_NAME = "cargo1.90-1.90.0-2.6.aarch64.rpm"
RPM_HASH = "73f2fcfb6c5163f8471df88704bcf7510fa84b393b5f7e20a1a146ee0a6f42fea73ac1fc56beee3766288fd32c202620d9747691bf6edabb772711d1daeea030"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.90 \
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
