SUMMARY = "Full-featured implementation of NTP with NTS support"
DESCRIPTION = "A full-featured implementation of the Network Time Protocol, \
including support for NTS (Network Time Security). \
 \
It includes both client and server support."
LICENSE = "Apache-2.0 | MIT"

PV = "1.9.0"

RPM_NAME = "ntpd-rs-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "263ce256d41ba9e49e77e98a2311d4f39867d2b0ae5a5c7b43e4f655e5c81eb9f744882a3f9204f1918d0a0a8de5f5db44572dd7497c4003be99f0bb033124c5"

RPROVIDES:${PN} += "bundled-rust-crate-aead \
bundled-rust-crate-aes \
bundled-rust-crate-aes-siv \
bundled-rust-crate-async-trait \
bundled-rust-crate-autocfg \
bundled-rust-crate-aws-lc-rs \
bundled-rust-crate-aws-lc-sys \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chacha20 \
bundled-rust-crate-cipher \
bundled-rust-crate-clock-steering \
bundled-rust-crate-cmac \
bundled-rust-crate-cmake \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-critical-section \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-ctr \
bundled-rust-crate-data-encoding \
bundled-rust-crate-dbl \
bundled-rust-crate-deranged \
bundled-rust-crate-digest \
bundled-rust-crate-displaydoc \
bundled-rust-crate-dunce \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fs-extra \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hickory-net \
bundled-rust-crate-hickory-proto \
bundled-rust-crate-hickory-resolver \
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
bundled-rust-crate-inout \
bundled-rust-crate-ipnet \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-litemap \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lru-cache \
bundled-rust-crate-md-5 \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-moka \
bundled-rust-crate-ntp-proto \
bundled-rust-crate-ntpd \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-potential-utf \
bundled-rust-crate-powerfmt \
bundled-rust-crate-pps-time \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-prefix-trie \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-resolv-conf \
bundled-rust-crate-ring \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-native-certs \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-platform-verifier \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-tagptr \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-timestamped-socket \
bundled-rust-crate-tinystr \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-rustls \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-untrusted \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-uuid \
bundled-rust-crate-version-check \
bundled-rust-crate-winnow \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zeroize \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
bundled-rust-crate-zmij \
config-ntpd-rs \
ntp-daemon \
ntpd-rs"

RDEPENDS:${PN} += "/usr/bin/sh \
group-ntpd-rs \
group-ntpd-rs-observe \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
ntpd-rs-common \
user-ntpd-rs \
user-ntpd-rs-observe"

inherit rpm
