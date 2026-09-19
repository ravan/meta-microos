SUMMARY = "An implementation of tldr in Rust"
DESCRIPTION = "An implementation of tldr in Rust. It has example based and community-driven man pages."
LICENSE = "Apache-2.0 | MIT"

PV = "1.8.0"

RPM_NAME = "tealdeer-1.8.0-1.7.aarch64.rpm"
RPM_HASH = "9a7a6c4c9d57669d13d205bda82c641b781a29b3f1146d72f6e36527b67cc4094c3fb94863a3386ce332258d7624ddfa9eae3fb495c1eedff2f9091a8af619e0"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-app-dirs2 \
bundled-rust-crate-base64 \
bundled-rust-crate-base64ct \
bundled-rust-crate-bitflags \
bundled-rust-crate-bumpalo \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crc32fast \
bundled-rust-crate-der \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-http \
bundled-rust-crate-httparse \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libz-rs-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-native-tls \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-macros \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-pager \
bundled-rust-crate-pem-rfc7468 \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-ring \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-native-certs \
bundled-rust-crate-rustls-pemfile \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-platform-verifier \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-tealdeer \
bundled-rust-crate-terminal-size \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-write \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-untrusted \
bundled-rust-crate-ureq \
bundled-rust-crate-ureq-proto \
bundled-rust-crate-utf-8 \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vcpkg \
bundled-rust-crate-webpki-root-certs \
bundled-rust-crate-winnow \
bundled-rust-crate-xdg \
bundled-rust-crate-yansi \
bundled-rust-crate-zeroize \
bundled-rust-crate-zip \
bundled-rust-crate-zlib-rs \
bundled-rust-crate-zopfli \
tealdeer"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3"

inherit rpm
