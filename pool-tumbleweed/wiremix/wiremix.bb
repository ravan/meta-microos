SUMMARY = "Simple TUI audio mixer for PipeWire"
DESCRIPTION = "wiremix is a simple TUI audio mixer for PipeWire. \
You can use it to adjust volumes, route audio \
between devices and applications, and configure \
audio device settings like input/output ports and \
profiles."
LICENSE = "MIT | Apache-2.0"

PV = "0.11.0~0"

RPM_NAME = "wiremix-0.11.0~0-1.2.aarch64.rpm"
RPM_HASH = "eae495ac6f7d2223d10ea45e5fea0c7188e2e8aaaafca8f11155c4f78abfe5c48c0c00e6a2449986b3f93b5138fa6e8039d0eacffb049dad5c73dca0e2a74f52"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-annotate-snippets \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-bs58 \
bundled-rust-crate-bytemuck \
bundled-rust-crate-cassowary \
bundled-rust-crate-castaway \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-expr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-compact-str \
bundled-rust-crate-convert-case \
bundled-rust-crate-cookie-factory \
bundled-rust-crate-crossterm \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deranged \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-document-features \
bundled-rust-crate-dyn-clone \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-foldhash \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-timer \
bundled-rust-crate-futures-util \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ident-case \
bundled-rust-crate-indexmap \
bundled-rust-crate-indoc \
bundled-rust-crate-instability \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-libm \
bundled-rust-crate-libspa \
bundled-rust-crate-libspa-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litrs \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lru \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-num-complex \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pipewire \
bundled-rust-crate-pipewire-sys \
bundled-rust-crate-pkg-config \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pulp \
bundled-rust-crate-pulp-wasm-simd-flag \
bundled-rust-crate-quote \
bundled-rust-crate-ratatui \
bundled-rust-crate-reborrow \
bundled-rust-crate-ref-cast \
bundled-rust-crate-ref-cast-impl \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-schemars \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serde-with \
bundled-rust-crate-serde-with-macros \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-system-deps \
bundled-rust-crate-target-lexicon \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-truncate \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-version-compare \
bundled-rust-crate-winnow \
bundled-rust-crate-wiremix \
bundled-rust-crate-zmij \
wiremix"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpipewire-0.3.so.0"

inherit rpm
