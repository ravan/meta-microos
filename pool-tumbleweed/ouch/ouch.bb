SUMMARY = "Compression and decompression utility for the terminal"
DESCRIPTION = "The 'Obvious Unified Compression Helper' is a CLI tool for \
compressing and decompressing files from and to several formats."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "ouch-0.8.3-1.1.aarch64.rpm"
RPM_HASH = "0dbe6957b226285299b19b1842b12dac876c2370ab267be8557535c816b76b3513fcb672aaf3cfebad515c22df3fc9946a600b63fd7a9e7d94ba224f5b1b3d9b"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-aes \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-alloc-no-stdlib \
bundled-rust-crate-alloc-stdlib \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-block-padding \
bundled-rust-crate-brotli \
bundled-rust-crate-brotli-decompressor \
bundled-rust-crate-bstr \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-bytesize \
bundled-rust-crate-bzip2 \
bundled-rust-crate-bzip3 \
bundled-rust-crate-cbc \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-cipher \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-complete-nushell \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-cmov \
bundled-rust-crate-colorchoice \
bundled-rust-crate-const-oid \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-core-affinity \
bundled-rust-crate-cpubits \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-ctutils \
bundled-rust-crate-deranged \
bundled-rust-crate-digest \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-file-type-enum \
bundled-rust-crate-filetime \
bundled-rust-crate-filetime-creation \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-flume \
bundled-rust-crate-fs-err \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-sink \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-globset \
bundled-rust-crate-gzp \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hmac \
bundled-rust-crate-hybrid-array \
bundled-rust-crate-ignore \
bundled-rust-crate-indexmap \
bundled-rust-crate-inout \
bundled-rust-crate-is-executable \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-jobserver \
bundled-rust-crate-libbz2-rs-sys \
bundled-rust-crate-libbzip3-sys \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lz4-flex \
bundled-rust-crate-lzma-rust2 \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nanorand \
bundled-rust-crate-nom \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-cpus \
bundled-rust-crate-once-cell \
bundled-rust-crate-ouch \
bundled-rust-crate-pbkdf2 \
bundled-rust-crate-pkg-config \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppmd-rust \
bundled-rust-crate-prettyplease \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustix \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde-core \
bundled-rust-crate-sevenz-rust2 \
bundled-rust-crate-sha1 \
bundled-rust-crate-sha2 \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-snap \
bundled-rust-crate-spin \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-tar \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-twox-hash \
bundled-rust-crate-typed-path \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unrar-ng \
bundled-rust-crate-unrar-ng-sys \
bundled-rust-crate-utf8parse \
bundled-rust-crate-walkdir \
bundled-rust-crate-widestring \
bundled-rust-crate-xattr \
bundled-rust-crate-zeroize \
bundled-rust-crate-zip \
bundled-rust-crate-zlib-rs \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
ouch"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
