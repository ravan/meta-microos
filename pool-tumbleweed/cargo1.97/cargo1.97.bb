SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.97.1"

RPM_NAME = "cargo1.97-1.97.1-1.3.aarch64.rpm"
RPM_HASH = "d91de3357dd14fc1e297ad19ba6c3ee196d613bb523c322e7fb7daa3bf2d8ef6169f779a8956511ca0dd3162caa82a8c0cdd7e09084e82c748fd8c0488cdb4c1"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.97 \
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
