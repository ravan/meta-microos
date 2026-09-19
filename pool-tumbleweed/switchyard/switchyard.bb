SUMMARY = "Routing and translating proxy for LLM traffic"
DESCRIPTION = "Switchyard is a proxy and library for LLM traffic. It routes requests across \
providers, translates between the OpenAI Chat, Anthropic Messages and OpenAI \
Responses wire formats, and exports Prometheus metrics for requests, errors, \
latency, tokens and routing overhead. \
 \
Routing algorithms are configured declaratively in TOML: pass-through, random \
spread across several models for A/B benchmarking, LLM-as-classifier routing, \
and signal-driven stage routing between a capable and an efficient target. \
 \
This package ships the standalone proxy as /usr/bin/switchyard-server \
together with a systemd service. The user-facing /usr/bin/switchyard command \
and the importable Python library are in the python-switchyard subpackage."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause & ISC & MIT-0 & Unicode-3.0 & Zlib"

PV = "0.2.0"

RPM_NAME = "switchyard-0.2.0-1.2.aarch64.rpm"
RPM_HASH = "2a2532a20cce494075550d2c1dbd7ea85e605288cede6103375774396987ce9743ab89fca7252bda885c8f5931915e68ebd449f30c26cddd799e8d897443a043"

RPROVIDES:${PN} += "bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-arc-swap \
bundled-rust-crate-async-stream \
bundled-rust-crate-async-stream-impl \
bundled-rust-crate-async-trait \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-autocfg \
bundled-rust-crate-aws-lc-rs \
bundled-rust-crate-aws-lc-sys \
bundled-rust-crate-axum \
bundled-rust-crate-axum-core \
bundled-rust-crate-axum-server \
bundled-rust-crate-base64 \
bundled-rust-crate-bit-set \
bundled-rust-crate-bit-vec \
bundled-rust-crate-bitflags \
bundled-rust-crate-borrow-or-share \
bundled-rust-crate-bytecount \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chacha20 \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-cmake \
bundled-rust-crate-colorchoice \
bundled-rust-crate-data-encoding \
bundled-rust-crate-displaydoc \
bundled-rust-crate-dunce \
bundled-rust-crate-either \
bundled-rust-crate-email-address \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fancy-regex \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fluent-uri \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fraction \
bundled-rust-crate-fs-err \
bundled-rust-crate-fs-extra \
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
bundled-rust-crate-h2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-http-body-util \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-humantime \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-rustls \
bundled-rust-crate-hyper-util \
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
bundled-rust-crate-ipnet \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-jsonptr \
bundled-rust-crate-jsonschema \
bundled-rust-crate-jsonschema-regex \
bundled-rust-crate-jsonschema-value \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-litemap \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lru-slab \
bundled-rust-crate-matchers \
bundled-rust-crate-matchit \
bundled-rust-crate-memchr \
bundled-rust-crate-micromap \
bundled-rust-crate-mime \
bundled-rust-crate-mio \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-cmp \
bundled-rust-crate-num-complex \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-iter \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-opentelemetry \
bundled-rust-crate-opentelemetry-http \
bundled-rust-crate-opentelemetry-otlp \
bundled-rust-crate-opentelemetry-prometheus \
bundled-rust-crate-opentelemetry-proto \
bundled-rust-crate-opentelemetry-sdk \
bundled-rust-crate-outref \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-potential-utf \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-prometheus \
bundled-rust-crate-prost \
bundled-rust-crate-prost-derive \
bundled-rust-crate-protobuf \
bundled-rust-crate-protobuf-support \
bundled-rust-crate-quinn \
bundled-rust-crate-quinn-proto \
bundled-rust-crate-quinn-udp \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rand-pcg \
bundled-rust-crate-ref-cast \
bundled-rust-crate-ref-cast-impl \
bundled-rust-crate-referencing \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-reqwest \
bundled-rust-crate-ring \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-native-certs \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-platform-verifier \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-path-to-error \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serde-urlencoded \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-subtle \
bundled-rust-crate-switchyard-libsy \
bundled-rust-crate-switchyard-llm-client \
bundled-rust-crate-switchyard-protocol \
bundled-rust-crate-switchyard-server \
bundled-rust-crate-switchyard-translation \
bundled-rust-crate-syn \
bundled-rust-crate-sync-wrapper \
bundled-rust-crate-synstructure \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tinystr \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-rustls \
bundled-rust-crate-tokio-stream \
bundled-rust-crate-tokio-util \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-tower \
bundled-rust-crate-tower-http \
bundled-rust-crate-tower-layer \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-opentelemetry \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-try-lock \
bundled-rust-crate-unicode-general-category \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-untrusted \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid-simd \
bundled-rust-crate-version-check \
bundled-rust-crate-vsimd \
bundled-rust-crate-want \
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
group-switchyard \
switchyard \
user-switchyard"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates-mozilla \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
sysuser-shadow"

inherit rpm
