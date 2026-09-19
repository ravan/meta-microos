SUMMARY = "Terminal ePub reader"
DESCRIPTION = "bk is a terminal EPUB reader, written in Rust with many features: \
 * Cross platform - Linux, macOS and Windows support \
 * Single binary, instant startup \
 * EPUB 2/3 support \
 * Vim bindings \
 * Incremental search \
 * Bookmarks"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "bk-0.6.0-1.12.aarch64.rpm"
RPM_HASH = "7aa7c604a295710ced9505638e9edb02cef63c30d24cf78fe1344132ed32c49a61ef504f556f9763a9c35dbcc38978018b3995d9bfe0a9417666d3f0944fdb05"

RPROVIDES:${PN} += "bk \
bundled-rust-crate-adler \
bundled-rust-crate-argh \
bundled-rust-crate-argh-derive \
bundled-rust-crate-argh-shared \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-bk \
bundled-rust-crate-byteorder \
bundled-rust-crate-cfg-if \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossterm \
bundled-rust-crate-flate2 \
bundled-rust-crate-instant \
bundled-rust-crate-libc \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-ron \
bundled-rust-crate-roxmltree \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-xmlparser \
bundled-rust-crate-zip"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
