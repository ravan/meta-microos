SUMMARY = "Command-line benchmarking tool"
DESCRIPTION = "A command-line tool which runs benchmarks of other programs passed as arguments. \
It includes: \
  * Statistical analysis across multiple runs \
  * Support for arbitrary shell commands \
  * Constant feedback about the benchmark progress and current estimates \
  * Warmup runs can be executed before the actual benchmark \
  * Cache-clearing commands can be set up before each timing run \
  * Statistical outlier detection to detect interference from other programs and caching effects \
  * Export results to various formats: CSV, JSON, Markdown, AsciiDoc \
  * Parameterized benchmarks (e.g. vary the number of threads)"
LICENSE = "Apache-2.0 | MIT"

PV = "1.20.0"

RPM_NAME = "hyperfine-1.20.0-2.4.aarch64.rpm"
RPM_HASH = "2deb96d30821e3d6c636aa2e4ccb8e5189a2b6372d4b50207d7c59ec2ee59188c633c60824f996117de3fff993f87c183a39696f91816b292d6dd5b1019b3c81"

RPROVIDES:${PN} += "bundled-rust-crate-ahash \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitvec \
bundled-rust-crate-borsh \
bundled-rust-crate-borsh-derive \
bundled-rust-crate-bytecheck \
bundled-rust-crate-bytecheck-derive \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colored \
bundled-rust-crate-console \
bundled-rust-crate-csv \
bundled-rust-crate-csv-core \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-funty \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hyperfine \
bundled-rust-crate-indexmap \
bundled-rust-crate-indicatif \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-nix \
bundled-rust-crate-num \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-complex \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-iter \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-number-prefix \
bundled-rust-crate-once-cell \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-ptr-meta \
bundled-rust-crate-ptr-meta-derive \
bundled-rust-crate-quote \
bundled-rust-crate-radium \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rand-hc \
bundled-rust-crate-rand-isaac \
bundled-rust-crate-rand-jitter \
bundled-rust-crate-rand-os \
bundled-rust-crate-rand-pcg \
bundled-rust-crate-rand-xorshift \
bundled-rust-crate-rend \
bundled-rust-crate-rkyv \
bundled-rust-crate-rkyv-derive \
bundled-rust-crate-rust-decimal \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-seahash \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shell-words \
bundled-rust-crate-simdutf8 \
bundled-rust-crate-statistical \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tap \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-version-check \
bundled-rust-crate-winnow \
bundled-rust-crate-wyz \
bundled-rust-crate-zerocopy \
hyperfine"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
