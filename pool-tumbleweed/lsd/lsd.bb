SUMMARY = "Ls command with a lot of pretty colors and some other stuff"
DESCRIPTION = "Ls command with a lot of pretty colors and some other stuff."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "lsd-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "800cbcf4f551ee16879f1fbd737308bd3477c0059215fa1b703addaaa3a0bb7d031e2b6a052915260651e0141bb7655934db0da88aa44aa45e40478e708e653b"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-chrono-humanize \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-convert-case \
bundled-rust-crate-crossterm \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-displaydoc \
bundled-rust-crate-document-features \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-git2 \
bundled-rust-crate-globset \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-human-sort \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-litrs \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lscolors \
bundled-rust-crate-lsd \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pkg-config \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pure-rust-locales \
bundled-rust-crate-quote \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-sys-locale \
bundled-rust-crate-term-grid \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tinystr \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uzers \
bundled-rust-crate-vcpkg \
bundled-rust-crate-version-check \
bundled-rust-crate-vsort \
bundled-rust-crate-wild \
bundled-rust-crate-writeable \
bundled-rust-crate-xattr \
bundled-rust-crate-xdg \
bundled-rust-crate-yaml-rust \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
lsd"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
