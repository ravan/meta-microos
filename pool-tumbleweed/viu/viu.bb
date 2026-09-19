SUMMARY = "Terminal image viewer with native support"
DESCRIPTION = "A small command-line application to view images from the terminal written \
in Rust. It is basically the front-end of viuer. It uses either iTerm, \
Kitty or SIXEL graphics protocol, if supported. If not, lower half blocks \
are displayed instead."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "viu-1.5.1-1.9.aarch64.rpm"
RPM_HASH = "44460e7eed0b119ca5115a38c5b699f42d13479c713332d069882069e9285930dfce21690d86a1afb072aaa6e7d785c67a5d4c84e54b6fd9f5ed044f1f9c5444"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-aligned-vec \
bundled-rust-crate-ansi-colours \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-arg-enum-proc-macro \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-av1-grain \
bundled-rust-crate-avif-serialize \
bundled-rust-crate-base64 \
bundled-rust-crate-bit-field \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitstream-io \
bundled-rust-crate-built \
bundled-rust-crate-bumpalo \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder-lite \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-quant \
bundled-rust-crate-colorchoice \
bundled-rust-crate-console \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-ctrlc \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-exr \
bundled-rust-crate-fastrand \
bundled-rust-crate-fdeflate \
bundled-rust-crate-flate2 \
bundled-rust-crate-getrandom \
bundled-rust-crate-gif \
bundled-rust-crate-half \
bundled-rust-crate-image \
bundled-rust-crate-image-webp \
bundled-rust-crate-imgref \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-jpeg-decoder \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lebe \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-loop9 \
bundled-rust-crate-make-cmd \
bundled-rust-crate-maybe-rayon \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-new-debug-unreachable \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-noop-proc-macro \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-derive \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-png \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-profiling \
bundled-rust-crate-profiling-procmacros \
bundled-rust-crate-qoi \
bundled-rust-crate-quick-error \
bundled-rust-crate-quote \
bundled-rust-crate-rav1e \
bundled-rust-crate-ravif \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rgb \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-scopeguard \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-simd-helpers \
bundled-rust-crate-sixel-rs \
bundled-rust-crate-sixel-sys \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tiff \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-v-frame \
bundled-rust-crate-viu \
bundled-rust-crate-viuer \
bundled-rust-crate-wasm-bindgen \
bundled-rust-crate-wasm-bindgen-backend \
bundled-rust-crate-wasm-bindgen-macro \
bundled-rust-crate-wasm-bindgen-macro-support \
bundled-rust-crate-wasm-bindgen-shared \
bundled-rust-crate-weezl \
bundled-rust-crate-zune-core \
bundled-rust-crate-zune-inflate \
bundled-rust-crate-zune-jpeg \
viu"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsixel.so.1"

inherit rpm
