SUMMARY = "A tool for generating C bindings from Rust code"
DESCRIPTION = "A tool for generating C bindings from Rust code."
LICENSE = "MPL-2.0"

PV = "0.29.4+git0"

RPM_NAME = "rust-cbindgen-0.29.4+git0-1.2.aarch64.rpm"
RPM_HASH = "fe4cb0d67e93ad3f58090722d2d7c850cde613056c02c3bed9c4f948207b1cfd974320f98abe6906624694e61295daaec6f54219bc0a0bb746d231cf9789671d"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-bitflags \
bundled-rust-crate-cbindgen \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-once-cell \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustix \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-winnow \
bundled-rust-crate-zmij \
rust-cbindgen"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
