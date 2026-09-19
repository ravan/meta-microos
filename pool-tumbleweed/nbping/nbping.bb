SUMMARY = "A ping tool with real-time data and visualizations"
DESCRIPTION = "A ping tool with real-time data and visualizations. \
 \
Features \
 * Supports concurrent Ping for multiple addresses.. \
 * Supports visual latency display. \
 * Real-time display of maximum, minimum, average latency, packet \
   loss rate, and other metrics. \
 * Support IPv4 and IPv6. \
 * Supports concurrent pinging of n ip's under one address. \
 * Support output results to files."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "nbping-0.7.1-1.4.aarch64.rpm"
RPM_HASH = "8cbb47d2578f5b7508fe33b00a3b475ac6ca61d1ade1fdc52f121d0fcd9b7a414b5f6c09952cafbc33f201cb179b4b08f8011db9b341421374668720d757946c"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cassowary \
bundled-rust-crate-castaway \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-compact-str \
bundled-rust-crate-crossterm \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-sink \
bundled-rust-crate-h2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-http-body-util \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-util \
bundled-rust-crate-ident-case \
bundled-rust-crate-indexmap \
bundled-rust-crate-indoc \
bundled-rust-crate-instability \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-regex \
bundled-rust-crate-lazy-regex-proc-macros \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lru \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-nbping \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pinger \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-prometheus \
bundled-rust-crate-protobuf \
bundled-rust-crate-quote \
bundled-rust-crate-ratatui \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-yaml-ng \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-util \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-try-lock \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-truncate \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-utf8parse \
bundled-rust-crate-want \
nbping"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
