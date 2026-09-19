SUMMARY = "CLI proxy that reduces LLM token consumption of dev commands"
DESCRIPTION = "rtk (Rust Token Killer) is a command line proxy for the shell commands that \
coding agents run most often. It executes the wrapped command, filters and \
compresses the output, and prints only the part that carries information, \
which cuts the number of tokens the result costs in an LLM context window. \
 \
It ships filters for more than a hundred commands across build systems, \
linters, test runners, version control and cloud tooling, and falls back to \
passing output through unchanged for anything it does not recognise."
LICENSE = "Apache-2.0 & BSD-3-Clause & CDLA-Permissive-2.0 & ISC & MIT & MPL-2.0 & Unicode-3.0"

PV = "0.49.0"

RPM_NAME = "rtk-0.49.0-1.1.aarch64.rpm"
RPM_HASH = "4a6d1baa16af9bd8a5ca3c6afe927bce4b8ed75dc7f18305febaf3c7821032abe150432f1a8cfd2dd6bc0314c119b24c0338cc4ccb05f4997a3625f1c22ff8b7"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-automod \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bstr \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-codepage \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colored \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-displaydoc \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fallible-iterator \
bundled-rust-crate-fallible-streaming-iterator \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-globset \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hashlink \
bundled-rust-crate-heck \
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
bundled-rust-crate-ignore \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libsqlite3-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-multiversion-no-op \
bundled-rust-crate-num-traits \
bundled-rust-crate-oem-cp \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-phf \
bundled-rust-crate-phf-shared \
bundled-rust-crate-pkg-config \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ring \
bundled-rust-crate-rtk \
bundled-rust-crate-rusqlite \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-rustversion \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sha2 \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-simdutf8 \
bundled-rust-crate-siphasher \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-tempfile \
bundled-rust-crate-tinystr \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-write \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-untrusted \
bundled-rust-crate-ureq \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vcpkg \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-webpki-roots \
bundled-rust-crate-which \
bundled-rust-crate-winnow \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zeroize \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
bundled-rust-crate-zlib-rs \
bundled-rust-crate-zmij \
rtk"

RDEPENDS:${PN} += "git-core \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0"

inherit rpm
