SUMMARY = "A more intuitive version of du"
DESCRIPTION = "Dust is meant to give you an instant overview of which directories are using \
disk space without requiring sort or head. Dust will print a maximum of one \
'Did not have permissions message'."
LICENSE = "Apache-2.0"

PV = "1.2.5"

RPM_NAME = "dust-1.2.5-1.2.aarch64.rpm"
RPM_HASH = "6ddfba0d44dec8f2fe9b019e48a7f74e0fcbf8da49f1072f73cf92f8b5b15775aa7f9636043112d9a68a86aa0e47c434cee6e25c766b79f9b7b024eacabd3497"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-colorchoice \
bundled-rust-crate-config-file \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-ctrlc \
bundled-rust-crate-du-dust \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lscolors \
bundled-rust-crate-memchr \
bundled-rust-crate-nix \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-traits \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rustix \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-stfu8 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-sysinfo \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thousands \
bundled-rust-crate-toml \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-zmij \
dust"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
