SUMMARY = "Tool that generates a compilation database for clang tooling"
DESCRIPTION = "Build ear produces compilation database in JSON format. This database \
describes how single compilation unit should be processed and can be \
used by Clang tooling."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "Bear-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "8c4c09ed8afdada186bead7c628cec156c24429c0fe804c37a887598d4bb85cc88ec2e0660b8b25967864b5e89893566b1d32428db200751d7ff7bfef7c6233a"

RPROVIDES:${PN} += "Bear \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-annotate-snippets \
bundled-rust-crate-anstyle \
bundled-rust-crate-anyhow \
bundled-rust-crate-arraydeque \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bear \
bundled-rust-crate-bear-driver \
bundled-rust-crate-bear-wrapper \
bundled-rust-crate-bitflags \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-compilers-codegen \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-ctor \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-encoding-rs-io \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-granit-parser \
bundled-rust-crate-heck \
bundled-rust-crate-intercept \
bundled-rust-crate-intercept-preload \
bundled-rust-crate-intercept-supervisor \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-link-section \
bundled-rust-crate-linktime-proc-macro \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-nohash-hasher \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-platform-checks \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-lite \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-semantic \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-saphyr \
bundled-rust-crate-shell-words \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-which \
bundled-rust-crate-zmij \
libexec.so"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
