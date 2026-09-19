SUMMARY = "Finds duplicate, unique, under- or over-replicated files"
DESCRIPTION = "A simple command-line utility program that finds duplicate, unique, under- or over-replicated files. \
Contrary to fdupes or rdfind, fclones processes files in parallel, which makes it very efficient on SSDs. \
fclones communicates through standard Unix streams and it can write reports in human- and machine-friendly formats, \
therefore you can easily combine it with other tools."
LICENSE = "MIT"

PV = "0.35.0"

RPM_NAME = "fclones-0.35.0-2.5.aarch64.rpm"
RPM_HASH = "31e7a0d97eec24b0ab88e3a48daecc3d503bb67c3eb495bd8d6acd977d407eac2e228a6de126c2215421843bf2052fd4e3f1222ff3ecd56231f0b0734614e59b"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-escapes \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bincode \
bundled-rust-crate-bitflags \
bundled-rust-crate-blake3 \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bstr \
bundled-rust-crate-byte-unit \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytesize \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-console \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-csv \
bundled-rust-crate-csv-core \
bundled-rust-crate-dashmap \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dtparse \
bundled-rust-crate-dunce \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fallible-iterator \
bundled-rust-crate-fclones \
bundled-rust-crate-fiemap \
bundled-rust-crate-file-owner \
bundled-rust-crate-filetime \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fs2 \
bundled-rust-crate-fxhash \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-globset \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ignore \
bundled-rust-crate-indexmap \
bundled-rust-crate-instant \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-keccak \
bundled-rust-crate-lazy-init \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-maplit \
bundled-rust-crate-memchr \
bundled-rust-crate-metrohash \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-nom-regex \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pin-project \
bundled-rust-crate-pin-project-internal \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-priority-queue \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-reflink \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rust-decimal \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sha2 \
bundled-rust-crate-sha3 \
bundled-rust-crate-shlex \
bundled-rust-crate-sled \
bundled-rust-crate-smallvec \
bundled-rust-crate-status-line \
bundled-rust-crate-stfu8 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-sysinfo \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-typed-sled \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-xattr \
bundled-rust-crate-xxhash-rust \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zmij \
fclones"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
