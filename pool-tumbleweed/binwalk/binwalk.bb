SUMMARY = "Firmware Analysis Tool"
DESCRIPTION = "Binwalk can identify, and optionally extract, files and data that \
have been embedded inside of other files. \
 \
While its primary focus is firmware analysis, it supports a wide \
variety of file and data types. \
 \
Through entropy analysis, it can even help to identify unknown \
compression or encryption!"
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "binwalk-3.1.0-1.8.aarch64.rpm"
RPM_HASH = "9492dc501fa8513fd076a9776d8c71a909bc139c9e9fd04d0f914a4fbc164c5843fda83cff0a371c571d6cb41a90fb2ca4bf262b20cd3b7363e7e40babe57592"

RPROVIDES:${PN} += "binwalk \
bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-binwalk \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder \
bundled-rust-crate-bzip2 \
bundled-rust-crate-bzip2-sys \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-quant \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colored \
bundled-rust-crate-crc32-v2 \
bundled-rust-crate-crc32c \
bundled-rust-crate-crc32fast \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dlib \
bundled-rust-crate-entropy \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-fdeflate \
bundled-rust-crate-flate2 \
bundled-rust-crate-float-ord \
bundled-rust-crate-font-kit \
bundled-rust-crate-freetype-sys \
bundled-rust-crate-getrandom \
bundled-rust-crate-gif \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-image \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jiff \
bundled-rust-crate-jpeg-decoder \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-log \
bundled-rust-crate-lzma-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-pathfinder-geometry \
bundled-rust-crate-pathfinder-simd \
bundled-rust-crate-pkg-config \
bundled-rust-crate-plotters \
bundled-rust-crate-plotters-backend \
bundled-rust-crate-plotters-bitmap \
bundled-rust-crate-plotters-svg \
bundled-rust-crate-png \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-version \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termsize \
bundled-rust-crate-threadpool \
bundled-rust-crate-ttf-parser \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-uuid-macro-internal \
bundled-rust-crate-walkdir \
bundled-rust-crate-weezl \
bundled-rust-crate-xxhash-rust \
bundled-rust-crate-xz2 \
bundled-rust-crate-yeslogic-fontconfig-sys \
bundled-rust-crate-zerocopy"

RDEPENDS:${PN} += "libbz2.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
