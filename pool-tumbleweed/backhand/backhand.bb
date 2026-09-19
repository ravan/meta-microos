SUMMARY = "Tools for the reading, creating, and modification of SquashFS file systems"
DESCRIPTION = "Tools for the reading, creating, and modification of SquashFS file systems. \
 \
* unsquashfs-backhand \
  - tool to uncompress, extract and list squashfs filesystems \
* add-backhand \
  - tool to add a file or directory to squashfs filesystems \
* replace-backhand \
  - tool to replace files in squashfs filesystems"
LICENSE = "Apache-2.0 | MIT"

PV = "0.25.3"

RPM_NAME = "backhand-0.25.3-1.1.aarch64.rpm"
RPM_HASH = "2388e2d2984d999da637f9057d6c370e47c549030c935100fadf29585355d0bc67f05952f71e113c89c52a3ffeafdd7505bd1a0ea76565868107bb1deeaccdfb"

RPROVIDES:${PN} += "backhand \
bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-backhand \
bundled-rust-crate-backhand-cli \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitvec \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-cargo \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-print \
bundled-rust-crate-color-print-proc-macro \
bundled-rust-crate-colorchoice \
bundled-rust-crate-console \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deku \
bundled-rust-crate-deku-derive \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-funty \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-ident-case \
bundled-rust-crate-indexmap \
bundled-rust-crate-indicatif \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-liblzma \
bundled-rust-crate-liblzma-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-lz4-flex \
bundled-rust-crate-matchers \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nix \
bundled-rust-crate-no-std-io2 \
bundled-rust-crate-nom \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-cpus \
bundled-rust-crate-once-cell \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-radium \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-serde-core \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-smallvec \
bundled-rust-crate-solana-nohash-hasher \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tap \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unit-prefix \
bundled-rust-crate-utf8parse \
bundled-rust-crate-winnow \
bundled-rust-crate-wyz \
bundled-rust-crate-xxhash-rust \
bundled-rust-crate-zlib-rs \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
