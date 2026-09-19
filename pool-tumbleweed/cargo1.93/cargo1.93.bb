SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.93.0"

RPM_NAME = "cargo1.93-1.93.0-3.6.aarch64.rpm"
RPM_HASH = "125a4defdd90c98ea2ddddf619520611f86c65dfd2836a4d3c7d9496f9c47bdc4e2c343ae68458e6a14303991bc8284361db02bb96126b3053e14e07f520102d"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.93 \
rust+cargo"

RDEPENDS:${PN} += "gcc \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1 \
rust-std"

inherit rpm
