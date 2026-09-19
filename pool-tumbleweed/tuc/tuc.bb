SUMMARY = "When cut doesn't cut it"
DESCRIPTION = "You want to cut on more than just a character, perhaps using negative indexes or format the selected fields as you want... Maybe you want to cut on lines - ever needed to drop or keep first and last line? That's where tuc can help."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "tuc-1.3.0-1.8.aarch64.rpm"
RPM_HASH = "3734ea5d0d92ad9d09fc981fef8961cee0095648112b97b52bc5c1673091abb22701ac2a8ad172c360f8f1e0b7af37ce341e952d7f855717e63f6fdde3587d57"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anyhow \
bundled-rust-crate-bstr \
bundled-rust-crate-either \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-pico-args \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-json \
bundled-rust-crate-tuc \
tuc"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
