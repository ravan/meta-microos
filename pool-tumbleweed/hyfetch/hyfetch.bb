SUMMARY = "Customizable Linux System Information Script"
DESCRIPTION = "HyFetch is a command line script to display information about your \
Linux system, such as amount of installed packages, OS and kernel \
version, active GTK theme, CPU info, and used/available memory. \
It is a fork of neofetch, and adds pride flag coloration to the OS logo."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "hyfetch-2.1.0-6.4.aarch64.rpm"
RPM_HASH = "2204237366716c46900a7eb5da8a9ca1de900f142d966c3325ec09ee65a8d10df66576f86df7d116f67c3f8de92b1c42e875a14ecb9daff834e91a447ee10273"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-colours \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anyhow \
bundled-rust-crate-approx \
bundled-rust-crate-assert-float-eq \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bpaf \
bundled-rust-crate-by-address \
bundled-rust-crate-cfg-if \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crossterm \
bundled-rust-crate-deranged \
bundled-rust-crate-directories \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-document-features \
bundled-rust-crate-either \
bundled-rust-crate-enterpolation \
bundled-rust-crate-env-home \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fast-srgb8 \
bundled-rust-crate-fastrand \
bundled-rust-crate-fs-extra \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hyfetch \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-ci \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litrs \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-owo-colors \
bundled-rust-crate-palette \
bundled-rust-crate-palette-derive \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-path-to-error \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shell-words \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-supports-color \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-terminal-colorsaurus \
bundled-rust-crate-terminal-size \
bundled-rust-crate-terminal-trx \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-writer \
bundled-rust-crate-topology-traits \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-utf8parse \
bundled-rust-crate-which \
bundled-rust-crate-xterm-color \
bundled-rust-crate-zmij \
hyfetch"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
