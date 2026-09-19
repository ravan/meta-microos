SUMMARY = "A very fast linker for Linux"
DESCRIPTION = "Wild is a linker with the goal of being very fast for iterative \
development. It supports the linker plugin API originally part of the \
Gold linker (also supported by GNU ld and Mold), and offers extensive \
linker-script features. \
 \
The plan is to eventually make it incremental, however that isn't \
yet implemented."
LICENSE = "Apache-2.0 | MIT"

PV = "0.10.0"

RPM_NAME = "wild-0.10.0-2.2.aarch64.rpm"
RPM_HASH = "78084069f38ad076f4671bd099f0760ef3baf8ae48381f2bc3c71add4691e9a031de1e97e5c7421a54a3bc7550dd14e73eb4723cc9a44bf4cfa7b880f23f2756"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-atomic-take \
bundled-rust-crate-bitflags \
bundled-rust-crate-blake3 \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bumpalo \
bundled-rust-crate-bumpalo-herd \
bundled-rust-crate-bytes \
bundled-rust-crate-bytesize \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chacha20 \
bundled-rust-crate-cobs \
bundled-rust-crate-colored \
bundled-rust-crate-colosseum \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-convert-case \
bundled-rust-crate-cpp-demangle \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-debugid \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-digest \
bundled-rust-crate-either \
bundled-rust-crate-embedded-io \
bundled-rust-crate-equivalent \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-foldhash \
bundled-rust-crate-getrandom \
bundled-rust-crate-gimli \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-hybrid-array \
bundled-rust-crate-indexmap \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-leb128 \
bundled-rust-crate-leb128fmt \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-libwild \
bundled-rust-crate-linker-layout \
bundled-rust-crate-linker-trace \
bundled-rust-crate-linker-utils \
bundled-rust-crate-matchers \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nix \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-paste \
bundled-rust-crate-perf-event \
bundled-rust-crate-perf-event-open-sys \
bundled-rust-crate-perfetto-recorder \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-postcard \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-prost \
bundled-rust-crate-prost-derive \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-core \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustc-version \
bundled-rust-crate-ruzstd \
bundled-rust-crate-ryu \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-sha2 \
bundled-rust-crate-sharded-offset-map \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-sharded-vec-writer \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-symbolic-common \
bundled-rust-crate-symbolic-demangle \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-twox-hash \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-uuid \
bundled-rust-crate-wasm-encoder \
bundled-rust-crate-wasmparser \
bundled-rust-crate-wild-linker \
bundled-rust-crate-winnow \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
bundled-rust-crate-zlib-rs \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
wild"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
