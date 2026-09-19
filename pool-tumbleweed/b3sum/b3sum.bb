SUMMARY = "A multithreaded rust implementation of BLAKE3"
DESCRIPTION = "The official Rust implementation of the BLAKE3 cryptographic hash \
function. It uses multithreading by default, making it an order of \
magnitude faster than e.g. sha256sum on typical desktop hardware."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "1.8.3"

RPM_NAME = "b3sum-1.8.3-1.6.aarch64.rpm"
RPM_HASH = "f2474ef6cae10890d0250bd9efc66b56809c6800a4992b9bfd403fa221c7b92834a58de5452225035937b8341626b44295f5d6973f012b68d6eb3e31096beba3"

RPROVIDES:${PN} += "b3sum \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-b3sum \
bundled-rust-crate-bitflags \
bundled-rust-crate-blake3 \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memmap2 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rustix \
bundled-rust-crate-shlex \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-wild"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
