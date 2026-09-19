SUMMARY = "A task runner for AI CLI tools"
DESCRIPTION = "amake is a task runner for AI CLI tools. Think make, but for dispatching \
prompts to things like Claude Code, Aider, GitHub Copilot, and others. \
 \
Tasks are defined in a TOML file (Amakefile), each with a prompt and \
a tool adapter. amake figures out the right CLI invocation and runs it. \
Tasks can depend on each other, pass captured output downstream via \
template variables, and optionally run inside a clampdown sandbox for \
filesystem and network isolation."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "amake-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "9513be8163aa0b656a0d7081356082ab2d4ea9614624451afde172474ba0b85318798c832c178dbae0ca6a589ec615f09d39e95477184b41b2a86dcf8c01d225"

RPROVIDES:${PN} += "amake \
bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-amake \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-base64 \
bundled-rust-crate-bincode \
bundled-rust-crate-bit-set \
bundled-rust-crate-bit-vec \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-convert-case \
bundled-rust-crate-coolor \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crokey \
bundled-rust-crate-crokey-proc-macros \
bundled-rust-crate-crossbeam \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-deranged \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-document-features \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fancy-regex \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-regex \
bundled-rust-crate-lazy-regex-proc-macros \
bundled-rust-crate-libc \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litrs \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-minimad \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-num-conv \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-plist \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-smallvec \
bundled-rust-crate-strict \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-syntect \
bundled-rust-crate-termimad \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-wait-timeout \
bundled-rust-crate-walkdir \
bundled-rust-crate-winnow \
bundled-rust-crate-yaml-rust \
bundled-rust-crate-zmij"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
