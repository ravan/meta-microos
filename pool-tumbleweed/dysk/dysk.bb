SUMMARY = "Get information on filesystems, like df but better"
DESCRIPTION = "A linux utility to get information on filesystems, like df but better"
LICENSE = "MIT"

PV = "3.6.1"

RPM_NAME = "dysk-3.6.1-1.1.aarch64.rpm"
RPM_HASH = "0d28bbcbfdb460ae0dd7aaeee0188b34b61b0ca5a9f682c87d831fec6eb9020bc287f39f01f0f66024eb89ffcca783801a401cf6126cf7ca29657c3aa05c86d8"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-bet \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-help \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-colorchoice \
bundled-rust-crate-convert-case \
bundled-rust-crate-coolor \
bundled-rust-crate-crokey \
bundled-rust-crate-crokey-proc-macros \
bundled-rust-crate-crossbeam \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-doc-comment \
bundled-rust-crate-document-features \
bundled-rust-crate-dysk \
bundled-rust-crate-dysk-cli \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-file-size \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-regex \
bundled-rust-crate-lazy-regex-proc-macros \
bundled-rust-crate-lfs-core \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litrs \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-minimad \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-snafu \
bundled-rust-crate-snafu-derive \
bundled-rust-crate-strict \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termimad \
bundled-rust-crate-terminal-light \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-winnow \
bundled-rust-crate-xterm-query \
bundled-rust-crate-zmij \
dysk"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
