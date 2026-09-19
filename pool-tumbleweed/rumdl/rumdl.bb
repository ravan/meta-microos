SUMMARY = "Markdown Linter written in Rust"
DESCRIPTION = "rumdl is a high-performance Markdown linter and formatter that helps ensure \
consistency and best practices in your Markdown files. Inspired by ruff 's \
approach to Python linting, rumdl brings similar speed and developer experience \
improvements to the Markdown ecosystem. \
 \
It offers: \
 \
- Built for speed with Rust - significantly faster than alternatives \
- 54 lint rules covering common Markdown issues \
- Automatic formatting with --fix for files and stdin/stdout \
- Zero dependencies - single binary with no runtime requirements \
- Highly configurable with TOML-based config files \
- Multiple installation options - Rust, Python, standalone binaries \
- Installable via pip for Python users \
- Modern CLI with detailed error reporting \
- CI/CD friendly with non-zero exit code on errors"
LICENSE = "MIT"

PV = "0.2.62"

RPM_NAME = "rumdl-0.2.62-1.1.aarch64.rpm"
RPM_HASH = "49779fc18e099ebb9ff69feb53c7317a05032b5177a7a91fdb3d4fbf8af2dee453588b9969fc7fd9d65321e37406c8adefd47aca08c0e42ec7792b6fc3f72d7a"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-async-trait \
bundled-rust-crate-auto-impl \
bundled-rust-crate-autocfg \
bundled-rust-crate-bit-set \
bundled-rust-crate-bit-vec \
bundled-rust-crate-bitflags \
bundled-rust-crate-blake3 \
bundled-rust-crate-bstr \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-cobs \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colored \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-dashmap \
bundled-rust-crate-displaydoc \
bundled-rust-crate-dyn-clone \
bundled-rust-crate-ec4rs \
bundled-rust-crate-either \
bundled-rust-crate-embedded-io \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-etcetera \
bundled-rust-crate-fancy-regex \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-globset \
bundled-rust-crate-hash32 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heapless \
bundled-rust-crate-heck \
bundled-rust-crate-httparse \
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
bundled-rust-crate-inotify \
bundled-rust-crate-inotify-sys \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-libc \
bundled-rust-crate-litemap \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lsp-types \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-notify \
bundled-rust-crate-notify-types \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project \
bundled-rust-crate-pin-project-internal \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-postcard \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pulldown-cmark \
bundled-rust-crate-pulldown-cmark-escape \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-ref-cast \
bundled-rust-crate-ref-cast-impl \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rumdl \
bundled-rust-crate-rustc-version \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-schemars \
bundled-rust-crate-schemars-derive \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-derive-internals \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-repr \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tikv-jemalloc-sys \
bundled-rust-crate-tikv-jemallocator \
bundled-rust-crate-tinystr \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-util \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-tower \
bundled-rust-crate-tower-layer \
bundled-rust-crate-tower-lsp \
bundled-rust-crate-tower-lsp-macros \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-walkdir \
bundled-rust-crate-winnow \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
bundled-rust-crate-zmij \
rumdl"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
