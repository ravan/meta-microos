SUMMARY = "Authoritative dns server for A/AAAA container records"
DESCRIPTION = "Aardvark-dns is an authoritative dns server for A/AAAA container records. \
It can forward other requests to configured resolvers."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "aardvark-dns-2.0.0-1.3.aarch64.rpm"
RPM_HASH = "a42c2e7fa652f5c6672b5cbc717c0d321aef86fdde7b1bb9c31799ea084d6e40d562bd269de5c4e19c40b4fbab4ca3eabf2b185e6c9566d50945803358017e33"

RPROVIDES:${PN} += "aardvark-dns \
bundled-rust-crate-aardvark-dns \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-arc-swap \
bundled-rust-crate-async-trait \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chacha20 \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-critical-section \
bundled-rust-crate-data-encoding \
bundled-rust-crate-deranged \
bundled-rust-crate-displaydoc \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flume \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-hickory-net \
bundled-rust-crate-hickory-proto \
bundled-rust-crate-hickory-server \
bundled-rust-crate-hostname \
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
bundled-rust-crate-inotify \
bundled-rust-crate-inotify-sys \
bundled-rust-crate-ipnet \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-litemap \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-potential-utf \
bundled-rust-crate-powerfmt \
bundled-rust-crate-prefix-trie \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-core \
bundled-rust-crate-ring \
bundled-rust-crate-rustversion \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-spin \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-syslog \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinystr \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-util \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-untrusted \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
