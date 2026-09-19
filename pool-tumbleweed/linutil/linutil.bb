SUMMARY = "Linutil is a toolbox designed to simplify everyday Linux tasks"
DESCRIPTION = "Chris Titus Tech's Linux Toolbox - Linutil is a distro-agnostic toolbox \
designed to simplify everyday Linux tasks."
LICENSE = "MIT"

PV = "2025.02.13~0"

RPM_NAME = "linutil-2025.02.13~0-1.10.aarch64.rpm"
RPM_HASH = "8e125d890a7374a5e7cf4a1f7c143eb81f5371cbfec3442a1cab7a2c46ad78fa769e0af4069064dce9896856fe51c0743cc9bb37c11b3e7d2706708e1e478d45"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstyle \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-byteorder \
bundled-rust-crate-cassowary \
bundled-rust-crate-castaway \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-compact-str \
bundled-rust-crate-crossterm \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deranged \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-ego-tree \
bundled-rust-crate-either \
bundled-rust-crate-env-home \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-filedescriptor \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-ident-case \
bundled-rust-crate-include-dir \
bundled-rust-crate-include-dir-macros \
bundled-rust-crate-indexmap \
bundled-rust-crate-indoc \
bundled-rust-crate-instability \
bundled-rust-crate-ioctl-rs \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linutil-core \
bundled-rust-crate-linutil-tui \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lru \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-threads \
bundled-rust-crate-oneshot \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-pin-utils \
bundled-rust-crate-portable-pty \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-ratatui \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serial \
bundled-rust-crate-serial-core \
bundled-rust-crate-serial-unix \
bundled-rust-crate-shell-words \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-static-assertions \
bundled-rust-crate-streaming-iterator \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-temp-dir \
bundled-rust-crate-termios \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-tree-sitter \
bundled-rust-crate-tree-sitter-bash \
bundled-rust-crate-tree-sitter-highlight \
bundled-rust-crate-tree-sitter-language \
bundled-rust-crate-tui-term \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-truncate \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vt100-ctt \
bundled-rust-crate-vte \
bundled-rust-crate-vte-generate-state-changes \
bundled-rust-crate-which \
bundled-rust-crate-winnow \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
linutil"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
