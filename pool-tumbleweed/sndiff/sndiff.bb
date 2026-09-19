SUMMARY = "Tool for diffing packages and files from snapshots"
DESCRIPTION = "Small tool to get diff information of packages and files in /etc from \
different snapshots"
LICENSE = "MIT"

PV = "v0.3~0"

RPM_NAME = "sndiff-v0.3~0-1.2.aarch64.rpm"
RPM_HASH = "81ccbe6ca58f4eb8e5d736cb590981e7b14f7da77e1685d5313c9ed6af6ae1434f83032eedc8a5f0ed2ffb0ff0d2de148a978161a33b9cde96217595a2a2f6c9"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colored \
bundled-rust-crate-crossterm \
bundled-rust-crate-deranged \
bundled-rust-crate-downcast \
bundled-rust-crate-errno \
bundled-rust-crate-fragile \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-mockall \
bundled-rust-crate-mockall-derive \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-powerfmt \
bundled-rust-crate-predicates \
bundled-rust-crate-predicates-core \
bundled-rust-crate-predicates-tree \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-similar \
bundled-rust-crate-simplelog \
bundled-rust-crate-smallvec \
bundled-rust-crate-smawk \
bundled-rust-crate-sndiff \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termbg \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-termtree \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-linebreak \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
sndiff"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
