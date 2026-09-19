SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.85.1"

RPM_NAME = "cargo1.85-1.85.1-2.4.aarch64.rpm"
RPM_HASH = "38ae5c2688605d2697246afed0a7ab6aa0eaf3d6f5f1a2cfc3c0edb25466f2c5d1a75e16dd3ffc7f52cf1f2b614ebbcd0733ea4847ce6ece1c4e84145e2367bb"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.85 \
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
