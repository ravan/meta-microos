SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.96.1"

RPM_NAME = "cargo1.96-1.96.1-1.3.aarch64.rpm"
RPM_HASH = "82765c67d8f4ef92c185621ea25f46a5cd9a14b496f0b4bd9210cce279a72082482983fbddb78993e6af47c89ef63420a539ffc86ba444c79bea0e41b99b47d7"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.96 \
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
