SUMMARY = "Cleans up unused kernel drivers and firmware"
DESCRIPTION = "A simple tool to cleanup unused kernel drivers and firmware files."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "image-janitor-0.4.0-1.5.aarch64.rpm"
RPM_HASH = "f17afb6195fdd77a9dcab61c9acfc70520d386c04703208eb50d9614b2ae6387be601bd57a7c76396471f7c088a6f05864b2561b0b78e71384ea381989c6979a"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstyle \
bundled-rust-crate-anyhow \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-either \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-glob \
bundled-rust-crate-heck \
bundled-rust-crate-image-janitor \
bundled-rust-crate-lazy-static \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-path-clean \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
image-janitor"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
