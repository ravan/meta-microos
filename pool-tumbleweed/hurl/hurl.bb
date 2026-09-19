SUMMARY = "Run and test HTTP requests with plain text"
DESCRIPTION = "Hurl is a command line tool that runs HTTP requests defined in a simple plain \
text format. \
 \
It can perform requests, capture values and evaluate queries on headers and \
body response. Hurl is very versatile: it can be used for both fetching data \
and testing HTTP sessions."
LICENSE = "Apache-2.0"

PV = "8.0.1"

RPM_NAME = "hurl-8.0.1-1.3.aarch64.rpm"
RPM_HASH = "3927adf0b5d87c6930e8202d8f28172fd1d18cc931996ebb48ee8f989991703652144566139e067dd97e05d84883676c502c875cc387e437b3542a996c5f5b9c"

RPROVIDES:${PN} += "bundled-rust-crate-adler32 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-alloc-no-stdlib \
bundled-rust-crate-alloc-stdlib \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-brotli \
bundled-rust-crate-brotli-decompressor \
bundled-rust-crate-bstr \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chacha20 \
bundled-rust-crate-chrono \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colored \
bundled-rust-crate-const-oid \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crypto-common \
bundled-rust-crate-curl \
bundled-rust-crate-curl-sys \
bundled-rust-crate-dary-heap \
bundled-rust-crate-digest \
bundled-rust-crate-displaydoc \
bundled-rust-crate-either \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-foldhash \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hurl \
bundled-rust-crate-hurl-core \
bundled-rust-crate-hybrid-array \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libflate \
bundled-rust-crate-libflate-lz77 \
bundled-rust-crate-libloading \
bundled-rust-crate-libxml \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-md5 \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-no-std-io2 \
bundled-rust-crate-nom \
bundled-rust-crate-num-traits \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pkg-config \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rle-decode-fast \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustix \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sha2 \
bundled-rust-crate-shlex \
bundled-rust-crate-similar \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-terminal-size \
bundled-rust-crate-tinystr \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-vcpkg \
bundled-rust-crate-writeable \
bundled-rust-crate-xml \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
bundled-rust-crate-zmij \
hurl"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libxml2.so.16 \
libz.so.1"

inherit rpm
