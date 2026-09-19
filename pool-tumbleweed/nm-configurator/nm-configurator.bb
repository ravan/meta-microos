SUMMARY = "NM Configurator"
DESCRIPTION = "A CLI tool which makes it easy to generate and apply NetworkManager configurations."
LICENSE = "Apache-2.0"

PV = "0.3.5"

RPM_NAME = "nm-configurator-0.3.5-3.3.aarch64.rpm"
RPM_HASH = "1dc90ce35f67b658b55c437a21a3262813523cdd315a602ba9fff2b1d8d4bf5bce5232e455c436d1835e15e9be007cc3c3ea3e3d5089b1308bdcfda802a01627"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-async-broadcast \
bundled-rust-crate-async-recursion \
bundled-rust-crate-async-trait \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-configparser \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-defmt \
bundled-rust-crate-defmt-macros \
bundled-rust-crate-defmt-parser \
bundled-rust-crate-endi \
bundled-rust-crate-enumflags2 \
bundled-rust-crate-enumflags2-derive \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-ethtool \
bundled-rust-crate-event-listener \
bundled-rust-crate-event-listener-strategy \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-lite \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-genetlink \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hex \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jiff \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-mptcp-pm \
bundled-rust-crate-netlink-packet-core \
bundled-rust-crate-netlink-packet-generic \
bundled-rust-crate-netlink-packet-route \
bundled-rust-crate-netlink-packet-wireguard \
bundled-rust-crate-netlink-proto \
bundled-rust-crate-netlink-sys \
bundled-rust-crate-network-interface \
bundled-rust-crate-nispor \
bundled-rust-crate-nix \
bundled-rust-crate-nl-wireguard \
bundled-rust-crate-nmc \
bundled-rust-crate-nmstate \
bundled-rust-crate-once-cell \
bundled-rust-crate-ordered-stream \
bundled-rust-crate-parking \
bundled-rust-crate-paste \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rtnetlink \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-repr \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-sha1-smol \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-socket2 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-winnow \
bundled-rust-crate-wl-nl80211 \
bundled-rust-crate-zbus \
bundled-rust-crate-zbus-macros \
bundled-rust-crate-zbus-names \
bundled-rust-crate-zmij \
bundled-rust-crate-zvariant \
bundled-rust-crate-zvariant-derive \
bundled-rust-crate-zvariant-utils \
nm-configurator"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
