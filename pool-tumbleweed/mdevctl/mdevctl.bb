SUMMARY = "Mediated device management and persistence utility"
DESCRIPTION = "mdevctl is a utility for managing and persisting devices in the mediated device \
framework of the Linux kernel. Mediated devices are sub-devices of a parent \
device (e.g. a vGPU) which can be dynamically created and potentially used by \
drivers like vfio-mdev for assignment to virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "mdevctl-1.4.0-4.6.aarch64.rpm"
RPM_HASH = "1c2d10f738177327d0ffd6fae43ae42f1a7021deb20365ccb8f028b2b756682145869e5a39f1dd4de850ea8ce46276d4d0eab8676eee5cb101828d6d92fc8084"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-humantime \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-mdevctl \
bundled-rust-crate-memchr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
mdevctl"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
