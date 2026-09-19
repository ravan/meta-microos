SUMMARY = "A tldr-pages client written in Rust"
DESCRIPTION = "The tldr-pages project is a collection of community-maintained help pages for command-line tools, that aims to be a simpler, more approachable complement to traditional man pages."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "tlrc-1.13.1-1.4.aarch64.rpm"
RPM_HASH = "0dd23fcee8d937248778699f1158794f2a32bc72a09c045154f4c0b8b57817608729869c3a975c08cb1c0f8b9e67f43a655dff2e93e624483a30cde3f3b8038e"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crc32fast \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-http \
bundled-rust-crate-httparse \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-option-ext \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-ring \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-native-certs \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-platform-verifier \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-shlex \
bundled-rust-crate-socks \
bundled-rust-crate-strsim \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-tlrc \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-typed-path \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-untrusted \
bundled-rust-crate-ureq \
bundled-rust-crate-ureq-proto \
bundled-rust-crate-utf8-zero \
bundled-rust-crate-utf8parse \
bundled-rust-crate-winnow \
bundled-rust-crate-yansi \
bundled-rust-crate-zeroize \
bundled-rust-crate-zip \
bundled-rust-crate-zlib-rs \
tlrc"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
