SUMMARY = "A lightning-fast system fetch tool made with Rust"
DESCRIPTION = "A lightning-fast minimalist system fetch tool made in Rust. Even faster than pfetch."
LICENSE = "(Apache-2.0 | MIT) & (MIT | Unlicense) & MIT"

PV = "2.0.0"

RPM_NAME = "treefetch-2.0.0-1.9.aarch64.rpm"
RPM_HASH = "5583ceb63e330e7aa0e280dc733585a6d03f5d836280a1faa5890ec11780d9f2c754cb1528526b8bd0ebebaeb55558e3b20b90815fa36a20d3bc556a7c41c5c7"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-memchr \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-treefetch \
treefetch"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
