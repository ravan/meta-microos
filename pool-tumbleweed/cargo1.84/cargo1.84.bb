SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.84.1"

RPM_NAME = "cargo1.84-1.84.1-2.6.aarch64.rpm"
RPM_HASH = "689d42437acac71a5f49b4b43d5fb15f7407781257b98b728e52ea10c348e74af05a80f54ca49c08d5c0875aad5017326eabb1b04a8aac4291ca74eb11e512bb"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.84 \
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
