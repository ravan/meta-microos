SUMMARY = "Dynamic real-time view of running eBPF programs"
DESCRIPTION = "bpftop provides a dynamic real-time view of running eBPF programs. It displays \
the average runtime, events per second, and estimated total CPU % for each \
program."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "bpftop-0.7.1-1.10.aarch64.rpm"
RPM_HASH = "a4d2fd90bc8e636586087ee38650e0dc0a1fec9da93bde57d3238c4e3202f75dc07cc558f8b63276e6ce29ef9b905c6f06662063af297cdd56c2b145256c63fb"

RPROVIDES:${PN} += "bpftop \
bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bpftop \
bundled-rust-crate-camino \
bundled-rust-crate-cargo-metadata \
bundled-rust-crate-cargo-platform \
bundled-rust-crate-cassowary \
bundled-rust-crate-castaway \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-circular-buffer \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-compact-str \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossterm \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ident-case \
bundled-rust-crate-indoc \
bundled-rust-crate-instability \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libbpf-cargo \
bundled-rust-crate-libbpf-rs \
bundled-rust-crate-libbpf-sys \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lru \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-procfs \
bundled-rust-crate-procfs-core \
bundled-rust-crate-quote \
bundled-rust-crate-ratatui \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-journald \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-tui-input \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-truncate \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vsprintf"

RDEPENDS:${PN} += "libc.so.6 \
libelf.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libz.so.1"

inherit rpm
