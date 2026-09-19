SUMMARY = "A tool to easily kill processes running on a specified port"
DESCRIPTION = "A command-line utility for killing processes listening on specific ports. \
It's designed to be simple, fast, and effective. \
 \
Features: \
- Kill processes by port number \
- Supports multiple port numbers \
- Verbosity control"
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "killport-2.0.2-1.2.aarch64.rpm"
RPM_HASH = "44ba949400e9bcbe94d7e16ce11c335d76c8f00f134e243435607ac0d31416a8ccc294bd6aa49c9e54a50e488b2a04578bf320b94c5862630878c6de67c7674e"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-bollard \
bundled-rust-crate-bollard-stubs \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-clap-verbosity-flag \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crc32fast \
bundled-rust-crate-defmt \
bundled-rust-crate-defmt-macros \
bundled-rust-crate-defmt-parser \
bundled-rust-crate-displaydoc \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-errno \
bundled-rust-crate-flate2 \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-http-body-util \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-util \
bundled-rust-crate-hyperlocal \
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
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jiff \
bundled-rust-crate-jiff-core \
bundled-rust-crate-killport \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-procfs \
bundled-rust-crate-procfs-core \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-repr \
bundled-rust-crate-serde-urlencoded \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tinystr \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-util \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-try-lock \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-want \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
bundled-rust-crate-zmij \
killport"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
