SUMMARY = "Interactive Grep"
DESCRIPTION = "Runs grep in the background, allows interactively pick its results \
and open selected match in text editor of choice."
LICENSE = "MIT"

PV = "1.3.0~0"

RPM_NAME = "igrep-1.3.0~0-2.6.aarch64.rpm"
RPM_HASH = "3916ea599a550c724866046c6a6b5e4877ca4c07564d0c2b97b486842dcc3f30aaa991bad6460dc23b3a5b159e118429680a44100ff0a29d8d58865b4b5684ac"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-base64 \
bundled-rust-crate-bincode \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cassowary \
bundled-rust-crate-castaway \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-compact-str \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-deranged \
bundled-rust-crate-either \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-encoding-rs-io \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-globset \
bundled-rust-crate-grep \
bundled-rust-crate-grep-cli \
bundled-rust-crate-grep-matcher \
bundled-rust-crate-grep-printer \
bundled-rust-crate-grep-regex \
bundled-rust-crate-grep-searcher \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-home \
bundled-rust-crate-ignore \
bundled-rust-crate-igrep \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lru \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-num-conv \
bundled-rust-crate-once-cell \
bundled-rust-crate-onig \
bundled-rust-crate-onig-sys \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-pkg-config \
bundled-rust-crate-plist \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-ratatui \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-smallvec \
bundled-rust-crate-stability \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-syntect \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-truncate \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-walkdir \
bundled-rust-crate-which \
bundled-rust-crate-yaml-rust \
igrep"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
