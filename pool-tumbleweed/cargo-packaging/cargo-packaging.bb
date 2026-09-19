SUMMARY = "Macros and tools to assist with cargo and rust packaging"
DESCRIPTION = "A set of macros and tools to assist with cargo and rust packaging, written in a manner \
that follows upstream rust's best practices."
LICENSE = "MPL-2.0"

PV = "1.5.0+0"

RPM_NAME = "cargo-packaging-1.5.0+0-1.4.aarch64.rpm"
RPM_HASH = "04ca72043490fc1e5ebac5afd49cda7ed8b29f8b3a82d4c1a0fb5e3d34a497a11d9ff6ed5f7ec405d5e664499e6733cd7048a285c11770b131abf695d2c5a0b5"

RPROVIDES:${PN} += "cargo-packaging \
rpm-macro-build-rustflags \
rpm-macro-buildsystem-cargo-build \
rpm-macro-buildsystem-cargo-check \
rpm-macro-buildsystem-cargo-install \
rpm-macro-cargo-build \
rpm-macro-cargo-install \
rpm-macro-cargo-test \
rpm-macro-rust-arches \
rpm-macro-rust-tier1-arches"

RDEPENDS:${PN} += "cargo \
cargo-auditable \
libc.so.6 \
libgcc-s.so.1 \
zstd"

inherit rpm
