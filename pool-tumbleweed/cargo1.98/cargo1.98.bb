SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.98.1"

RPM_NAME = "cargo1.98-1.98.1-1.1.aarch64.rpm"
RPM_HASH = "9a3a1c4e3f7d07e336132512203d81eecb876d046b14c4eb3d8d5e645d78c5aa9b55caecf09fc06011b48939d9b6f2284c5d3f6a75408d84b8e2f626cad88c0e"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.98 \
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
