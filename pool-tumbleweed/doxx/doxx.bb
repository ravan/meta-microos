SUMMARY = "Terminal document viewer for .docx files"
DESCRIPTION = "A fast, terminal-native document viewer for Word files. \
View, search, and export .docx documents without leaving \
your command line. \
 \
Features: \
 * Beautiful terminal rendering with formatting, tables, and lists. \
 * Fast search with highlighting \
 * Smart tables with proper alignment and Unicode borders \
 * Copy to clipboard — grab content directly from the terminal \
 * Export formats — Markdown, CSV, JSON, plain text, \
   ANSI-colored output. \
 * Terminal images for Kitty, iTerm2, WezTerm. \
 * Color support — see Word document colors in your terminal."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "doxx-0.1.4-1.4.aarch64.rpm"
RPM_HASH = "7073a0f9db40412423360bb37ec904c65a5bc5006350e3d370c116f225e15316c804e9874da0163b339d7a2e7a7cd6ddf047b21c615829463b4b14b796483068"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-aes \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-aligned \
bundled-rust-crate-aligned-vec \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-ansi-colours \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-arboard \
bundled-rust-crate-arg-enum-proc-macro \
bundled-rust-crate-arrayvec \
bundled-rust-crate-as-slice \
bundled-rust-crate-autocfg \
bundled-rust-crate-av-scenechange \
bundled-rust-crate-av1-grain \
bundled-rust-crate-avif-serialize \
bundled-rust-crate-base64 \
bundled-rust-crate-base64-simd \
bundled-rust-crate-bit-field \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitstream-io \
bundled-rust-crate-block-buffer \
bundled-rust-crate-built \
bundled-rust-crate-bumpalo \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder \
bundled-rust-crate-byteorder-lite \
bundled-rust-crate-bzip2 \
bundled-rust-crate-bzip2-sys \
bundled-rust-crate-cassowary \
bundled-rust-crate-castaway \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-cipher \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-quant \
bundled-rust-crate-colorchoice \
bundled-rust-crate-compact-str \
bundled-rust-crate-console \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc \
bundled-rust-crate-crc-catalog \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-crypto-common \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deflate64 \
bundled-rust-crate-deranged \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-displaydoc \
bundled-rust-crate-docx-rs \
bundled-rust-crate-doxx \
bundled-rust-crate-either \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-equator \
bundled-rust-crate-equator-macro \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-exr \
bundled-rust-crate-fastrand \
bundled-rust-crate-fax \
bundled-rust-crate-fdeflate \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-foldhash \
bundled-rust-crate-generic-array \
bundled-rust-crate-gethostname \
bundled-rust-crate-getrandom \
bundled-rust-crate-gif \
bundled-rust-crate-half \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hmac \
bundled-rust-crate-icy-sixel \
bundled-rust-crate-ident-case \
bundled-rust-crate-image \
bundled-rust-crate-image-webp \
bundled-rust-crate-imgref \
bundled-rust-crate-indexmap \
bundled-rust-crate-indoc \
bundled-rust-crate-inout \
bundled-rust-crate-instability \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-jpeg-decoder \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lebe \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-loop9 \
bundled-rust-crate-lru \
bundled-rust-crate-lzma-rs \
bundled-rust-crate-lzma-sys \
bundled-rust-crate-maybe-rayon \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-moxcms \
bundled-rust-crate-new-debug-unreachable \
bundled-rust-crate-no-std-io2 \
bundled-rust-crate-nom \
bundled-rust-crate-noop-proc-macro \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-derive \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-outref \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-pastey \
bundled-rust-crate-pbkdf2 \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-png \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-profiling \
bundled-rust-crate-profiling-procmacros \
bundled-rust-crate-pxfm \
bundled-rust-crate-qoi \
bundled-rust-crate-quick-error \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-ratatui \
bundled-rust-crate-ratatui-image \
bundled-rust-crate-rav1e \
bundled-rust-crate-ravif \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rgb \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sha1 \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-simd-helpers \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tiff \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-write \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-truncate \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-v-frame \
bundled-rust-crate-version-check \
bundled-rust-crate-viuer \
bundled-rust-crate-vsimd \
bundled-rust-crate-wasm-bindgen \
bundled-rust-crate-wasm-bindgen-macro \
bundled-rust-crate-wasm-bindgen-macro-support \
bundled-rust-crate-wasm-bindgen-shared \
bundled-rust-crate-weezl \
bundled-rust-crate-winnow \
bundled-rust-crate-x11rb \
bundled-rust-crate-x11rb-protocol \
bundled-rust-crate-xz2 \
bundled-rust-crate-y4m \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
bundled-rust-crate-zeroize \
bundled-rust-crate-zeroize-derive \
bundled-rust-crate-zip \
bundled-rust-crate-zmij \
bundled-rust-crate-zopfli \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
bundled-rust-crate-zune-core \
bundled-rust-crate-zune-inflate \
bundled-rust-crate-zune-jpeg \
doxx"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
