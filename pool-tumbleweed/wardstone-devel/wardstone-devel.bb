SUMMARY = "FFI bindings for wardstone"
DESCRIPTION = "A version of wardstone_core that exports a foreign function interface for using the library from C and other languages that support it."
LICENSE = "ISC"

PV = "0.2.0~0"

RPM_NAME = "wardstone-devel-0.2.0~0-3.8.aarch64.rpm"
RPM_HASH = "e0b633fce5af91c9f1711d6404a48162a7b88079d3541b7ea5d68bb4dccdd28941f1a53d5363985c3a0b4c1c05f5f6fc7a76ceb5d564fff16d8e18dcc8e77d19"

RPROVIDES:${PN} += "bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cbindgen \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indexmap \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-toml \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-wardstone-core \
bundled-rust-crate-wardstone-ffi \
libwardstone.so \
wardstone-devel"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
