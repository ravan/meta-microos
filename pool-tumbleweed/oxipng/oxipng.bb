SUMMARY = "Multithreaded lossless PNG optimizer"
DESCRIPTION = "Oxipng is a multithreaded lossless PNG compression optimizer. It can be used \
via a command-line interface or as a library in other Rust programs."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "oxipng-10.1.0-1.6.aarch64.rpm"
RPM_HASH = "201f0185bad58382d498e41aaf8f6c05d1919eb9ed100b007c850f5b0e6346c017536c8ec0c7dbdbd6da77cb921a5bfe089e6e2b97cd1b7c3f45c3d4175198d7"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitvec \
bundled-rust-crate-bumpalo \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder-lite \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-either \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fdeflate \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-funty \
bundled-rust-crate-hashbrown \
bundled-rust-crate-image \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-libdeflate-sys \
bundled-rust-crate-libdeflater \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-moxcms \
bundled-rust-crate-num-traits \
bundled-rust-crate-oxipng \
bundled-rust-crate-parse-size \
bundled-rust-crate-pkg-config \
bundled-rust-crate-png \
bundled-rust-crate-pxfm \
bundled-rust-crate-radium \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rgb \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustix \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-strsim \
bundled-rust-crate-tap \
bundled-rust-crate-terminal-size \
bundled-rust-crate-utf8parse \
bundled-rust-crate-wyz \
bundled-rust-crate-zopfli \
oxipng"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
