SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.94.1"

RPM_NAME = "cargo1.94-1.94.1-1.6.aarch64.rpm"
RPM_HASH = "f125547289e6b268cdb0224960425907498b5ae98ac068d1950ce9d283f33af1e2720a800231b5449c0e3314aa84ef2565b280dc76c0ca6657c94c0628ea8ae6"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.94 \
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
