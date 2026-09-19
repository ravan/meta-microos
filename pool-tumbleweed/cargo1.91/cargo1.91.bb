SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.91.0"

RPM_NAME = "cargo1.91-1.91.0-3.7.aarch64.rpm"
RPM_HASH = "18824a17ae98076906798f4683039e2fa8bfc6593b9d2dbe56c8cd35ac7468fb5178b122db3cbd4fc52fa2d047aee877cdcd0956375346c805ec2ee528732aef"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.91 \
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
