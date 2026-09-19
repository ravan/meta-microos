SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.86.0"

RPM_NAME = "cargo1.86-1.86.0-3.6.aarch64.rpm"
RPM_HASH = "7b026e66b70717413c996325ed0a60fa87c4516612d91aed46be1ed068fe97b2341339d3abd9befcb2f2247de554bff91e2c5efee954d4bafec22f6214cd85c3"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.86 \
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
