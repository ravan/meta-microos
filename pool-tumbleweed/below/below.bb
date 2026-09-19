SUMMARY = "A time traveling resource monitor for modern Linux systems"
DESCRIPTION = "below is an interactive tool to view and record historical system data. It has support for: \
 \
- information regarding hardware resource utilization \
- viewing the cgroup hierarchy \
- cgroup and process information \
- pressure stall information (PSI) \
- record mode to record system data \
- replay mode to replay historical system data \
- live mode to view live system data \
- dump subcommand to report script-friendly information (e.g. JSON and CSV) \
 \
below does not have support for cgroup1."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "below-0.11.0-2.4.aarch64.rpm"
RPM_HASH = "e993248c40aeaf4f2bb2c50806de34d12f50cf9fc7e92ab8c71081252430969d0c521cb0619c91f3a466a0f2e980be4e30f49ffbe552a9dc3d58b2249bcd868f"

RPROVIDES:${PN} += "below \
bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-async-trait \
bundled-rust-crate-autocfg \
bundled-rust-crate-below \
bundled-rust-crate-below-btrfs \
bundled-rust-crate-below-common \
bundled-rust-crate-below-config \
bundled-rust-crate-below-derive \
bundled-rust-crate-below-dump \
bundled-rust-crate-below-ethtool \
bundled-rust-crate-below-gpu-stats \
bundled-rust-crate-below-model \
bundled-rust-crate-below-render \
bundled-rust-crate-below-store \
bundled-rust-crate-below-tc \
bundled-rust-crate-below-view \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-camino \
bundled-rust-crate-cargo-metadata \
bundled-rust-crate-cargo-platform \
bundled-rust-crate-castaway \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-cgroupfs \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-compact-str \
bundled-rust-crate-console \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-cursive \
bundled-rust-crate-cursive-core \
bundled-rust-crate-cursive-macros \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deranged \
bundled-rust-crate-either \
bundled-rust-crate-enum-iterator \
bundled-rust-crate-enum-iterator-derive \
bundled-rust-crate-enum-map \
bundled-rust-crate-enum-map-derive \
bundled-rust-crate-enumset \
bundled-rust-crate-enumset-derive \
bundled-rust-crate-equivalent \
bundled-rust-crate-erased-serde \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-fb-procfs \
bundled-rust-crate-filetime \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fnv \
bundled-rust-crate-futures-core \
bundled-rust-crate-getrandom \
bundled-rust-crate-half \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hostname \
bundled-rust-crate-humantime \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ident-case \
bundled-rust-crate-indexmap \
bundled-rust-crate-indicatif \
bundled-rust-crate-is-terminal \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libbpf-cargo \
bundled-rust-crate-libbpf-rs \
bundled-rust-crate-libbpf-sys \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-maplit \
bundled-rust-crate-match-cfg \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memoffset \
bundled-rust-crate-mio \
bundled-rust-crate-netlink-packet-core \
bundled-rust-crate-netlink-packet-route \
bundled-rust-crate-netlink-sys \
bundled-rust-crate-nix \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num \
bundled-rust-crate-num-complex \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-iter \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-number-prefix \
bundled-rust-crate-once-cell \
bundled-rust-crate-openat \
bundled-rust-crate-os-info \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-plain \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rand-distr \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-resctrlfs \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-cbor \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slog \
bundled-rust-crate-slog-term \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tar \
bundled-rust-crate-tempfile \
bundled-rust-crate-term \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-threadpool \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-vsprintf \
bundled-rust-crate-walkdir \
bundled-rust-crate-winnow \
bundled-rust-crate-xattr \
bundled-rust-crate-xi-unicode \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zmij \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
config-below"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libelf.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libz.so.1"

inherit rpm
