SUMMARY = "MCP server for Bugzilla with operator-controlled security guards"
DESCRIPTION = "bugwarden exposes Bugzilla to MCP (Model Context Protocol) clients through a \
guard policy that the client can neither read nor change. The policy is a TOML \
file read once at startup and decides, per bug, which of thirteen capabilities \
a client is granted, so an operator can expose a Bugzilla instance to an LLM \
client while keeping undisclosed security bugs, private comments and write \
access out of reach. \
 \
Denials are uniform: a bug hidden by policy is indistinguishable from one that \
does not exist, and search results filtered by policy are dropped silently. \
What the client may not see, the operator can: an optional append-only audit \
stream records every tool call together with the guard's verdict."
LICENSE = "(Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & ISC & MIT & Unicode-3.0"

PV = "0.6.0"

RPM_NAME = "bugwarden-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "2bfbed69ae856fd0eca9a69e2380f3f9c9afdca90cf75c4367135e5930124df843e1b07da0298755f722fbab8b6970c788b70d98a19710ffeac2417a46bc7d5f"

RPROVIDES:${PN} += "bugwarden \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-async-trait \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-autocfg \
bundled-rust-crate-aws-lc-rs \
bundled-rust-crate-aws-lc-sys \
bundled-rust-crate-axum \
bundled-rust-crate-axum-core \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bugwarden \
bundled-rust-crate-bugwarden-core \
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
bundled-rust-crate-cmake \
bundled-rust-crate-colorchoice \
bundled-rust-crate-const-oid \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crypto-common \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-digest \
bundled-rust-crate-displaydoc \
bundled-rust-crate-dunce \
bundled-rust-crate-dyn-clone \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fnv \
bundled-rust-crate-form-urlencoded \
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
bundled-rust-crate-hybrid-array \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-rustls \
bundled-rust-crate-hyper-util \
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
bundled-rust-crate-indexmap \
bundled-rust-crate-ipnet \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-lru-slab \
bundled-rust-crate-matchers \
bundled-rust-crate-matchit \
bundled-rust-crate-memchr \
bundled-rust-crate-mime \
bundled-rust-crate-mio \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-pastey \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quinn \
bundled-rust-crate-quinn-proto \
bundled-rust-crate-quinn-udp \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-core \
bundled-rust-crate-rand-pcg \
bundled-rust-crate-ref-cast \
bundled-rust-crate-ref-cast-impl \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-reqwest \
bundled-rust-crate-ring \
bundled-rust-crate-rmcp \
bundled-rust-crate-rmcp-macros \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-native-certs \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-platform-verifier \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-ryu \
bundled-rust-crate-schemars \
bundled-rust-crate-schemars-derive \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-derive-internals \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serde-urlencoded \
bundled-rust-crate-sha2 \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-sse-stream \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-subtle \
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
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-try-lock \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-untrusted \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-want \
bundled-rust-crate-winnow \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zeroize \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
bundled-rust-crate-zmij \
config-bugwarden"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
