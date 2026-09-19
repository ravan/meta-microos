SUMMARY = "CLI for fast querying of JSON, YAML, TOML, JSONL, CBOR, and MessagePack documents"
DESCRIPTION = "jsongrep is a command-line tool and Rust library for fast querying of JSON, \
YAML, TOML, JSONL, CBOR, and MessagePack documents using regular path \
expressions."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "jsongrep-0.9.0-1.4.aarch64.rpm"
RPM_HASH = "4033634cb6759df3be017a6f45ae068ac257ff8db5f7b1f63168194669ee8bfb5530d98e4f9a1d2850be9a57f705a2a9033eef0d2a7635358da951831e3d46f3"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-block-buffer \
bundled-rust-crate-cfg-if \
bundled-rust-crate-ciborium \
bundled-rust-crate-ciborium-io \
bundled-rust-crate-ciborium-ll \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-clap-verbosity-flag \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colored \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-digest \
bundled-rust-crate-either \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-generic-array \
bundled-rust-crate-half \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jiff \
bundled-rust-crate-jsongrep \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-num-traits \
bundled-rust-crate-pest \
bundled-rust-crate-pest-derive \
bundled-rust-crate-pest-generator \
bundled-rust-crate-pest-meta \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rmp \
bundled-rust-crate-rmp-serde \
bundled-rust-crate-roff \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-json-borrow \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-sha2 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-write \
bundled-rust-crate-typenum \
bundled-rust-crate-ucd-trie \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-winnow \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
bundled-rust-crate-zmij \
jg \
jsongrep"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
