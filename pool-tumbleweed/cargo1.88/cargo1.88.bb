SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.88.0"

RPM_NAME = "cargo1.88-1.88.0-1.6.aarch64.rpm"
RPM_HASH = "5814c134646357d22db89a4418057a53407f793543c0995f34b54ea8d4b6e9fcf8a89795638709daa6730ed63f16bbae44fd32017b69754e4cf1b607a138335b"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.88 \
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
