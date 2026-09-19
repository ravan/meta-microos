SUMMARY = "Ping, but with a graph"
DESCRIPTION = "Comes with the following super-powers: \
 \
- Graph the ping time for multiple hosts \
- Graph the execution time for commands via the --cmd flag \
- Custom colours"
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "gping-1.20.1-1.7.aarch64.rpm"
RPM_HASH = "0ae78e1086be5694795173dc61bc0eb0402a70f29e7cd76de598bcc9e06120ad72d0c51da959895527985301cbdf2c0c9a0d6d21705677e76ac58acea0500e93"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cassowary \
bundled-rust-crate-castaway \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-colorchoice \
bundled-rust-crate-compact-str \
bundled-rust-crate-const-format \
bundled-rust-crate-const-format-proc-macros \
bundled-rust-crate-convert-case \
bundled-rust-crate-crossterm \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deranged \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-displaydoc \
bundled-rust-crate-document-features \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-git2 \
bundled-rust-crate-gping \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-ident-case \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-indoc \
bundled-rust-crate-instability \
bundled-rust-crate-is-debug \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-regex \
bundled-rust-crate-lazy-regex-proc-macros \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-litrs \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lru \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pinger \
bundled-rust-crate-pkg-config \
bundled-rust-crate-potential-utf \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-ratatui \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-shadow-rs \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinystr \
bundled-rust-crate-tz-rs \
bundled-rust-crate-tzdb \
bundled-rust-crate-tzdb-data \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-truncate \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vcpkg \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
gping"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
