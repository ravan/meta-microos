SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.92.0"

RPM_NAME = "cargo1.92-1.92.0-3.4.aarch64.rpm"
RPM_HASH = "6ae95c5a663b0b39f14ea8a735882e9ded336bfcd3b00c8db37009b22eb5d20be11bc3d8b86091ba2ef928870d8440884f809ece4676e35b0ba99589cf1fd38a"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.92 \
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
