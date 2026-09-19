SUMMARY = "Rust extensions for Mercurial"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects. \
 \
This package contains Rust-based features for Mercurial: \
- hg-core (and hg-pyo3): implementation of some \
  functionality of mercurial in Rust, e.g. ancestry computations in \
  revision graphs, status or pull discovery. \
- rhg: a pure Rust implementation of Mercurial, with a fallback mechanism for \
  unsupported invocations. It reuses the logic `hg-core` but \
  completely forgoes interaction with Python. \
 \
These features are varying degrees of experimental and come with caveats. \
See 'hg help rust' (accessible without this package) \
or the documentation files in this package for more information. \
 \
Installing this package will enable the Rust extensions for hg immediately. \
rhg is its own separate program."
LICENSE = "GPL-2.0-or-later"

PV = "7.2.4"

RPM_NAME = "mercurial-rust-7.2.4-1.2.aarch64.rpm"
RPM_HASH = "80dad180beb3dcca9963dfb66643e00107ad39dbe255a50c212501d0a0596af5bf20a6fcf36c6276f3fc756959fba30eff2b89536c355b5344f5daebbc0b9ee4"

RPROVIDES:${PN} += "bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bit-set \
bundled-rust-crate-bit-vec \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitmaps \
bundled-rust-crate-bitvec \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bstr \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes-cast \
bundled-rust-crate-bytes-cast-derive \
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
bundled-rust-crate-console \
bundled-rust-crate-convert-case \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-ctrlc \
bundled-rust-crate-dashmap \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dyn-clone \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-filetime \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-foldhash \
bundled-rust-crate-format-bytes \
bundled-rust-crate-format-bytes-macros \
bundled-rust-crate-funty \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-hg-core \
bundled-rust-crate-hg-pyo3 \
bundled-rust-crate-home \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-im-rc \
bundled-rust-crate-imara-diff \
bundled-rust-crate-indexmap \
bundled-rust-crate-indicatif \
bundled-rust-crate-indoc \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-matchers \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memoffset \
bundled-rust-crate-nix \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-opaque-debug \
bundled-rust-crate-option-ext \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pyo3 \
bundled-rust-crate-pyo3-build-config \
bundled-rust-crate-pyo3-ffi \
bundled-rust-crate-pyo3-macros \
bundled-rust-crate-pyo3-macros-backend \
bundled-rust-crate-pyo3-sharedref \
bundled-rust-crate-quote \
bundled-rust-crate-radium \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rand-distr \
bundled-rust-crate-rand-pcg \
bundled-rust-crate-rand-xoshiro \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rhg \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-same-file \
bundled-rust-crate-schnellru \
bundled-rust-crate-scopeguard \
bundled-rust-crate-self-cell \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sha-1 \
bundled-rust-crate-sha2 \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shellexpand \
bundled-rust-crate-shlex \
bundled-rust-crate-sized-chunks \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-static-assertions-next \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tap \
bundled-rust-crate-target-lexicon \
bundled-rust-crate-tempfile \
bundled-rust-crate-thread-local \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-twox-hash \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-unindent \
bundled-rust-crate-unit-prefix \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-vcpkg \
bundled-rust-crate-vcsgraph \
bundled-rust-crate-version-check \
bundled-rust-crate-which \
bundled-rust-crate-whoami \
bundled-rust-crate-winnow \
bundled-rust-crate-wyz \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zmij \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
mercurial-rust"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
mercurial \
python-abi"

inherit rpm
