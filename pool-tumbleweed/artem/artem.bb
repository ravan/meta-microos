SUMMARY = "A CLI program to convert images to ASCII art"
DESCRIPTION = "Artem is a small cli program, written in rust, to easily convert images to \
ascii art, named after the latin word for art. By default it tries to use \
truecolor, if the terminal does not support truecolor, it falls back to 16 \
Color ANSI. When the ascii image is written to a file, the image will not \
use colors. It supports .jpeg, .png, .gif, .webp and many more."
LICENSE = "MPL-2.0"

PV = "3.0.0"

RPM_NAME = "artem-3.0.0-1.12.aarch64.rpm"
RPM_HASH = "ca124963cf78d59a8e72eca8b86018b871f1a3e71f5c372deeb762c06c19cbea2c6d8cf712637ac4854eb0824a8c0d8576756294760b3e77cd998369f3b9efd4"

RPROVIDES:${PN} += "artem \
bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-aligned-vec \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-lossy \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anstyle-svg \
bundled-rust-crate-anyhow \
bundled-rust-crate-arg-enum-proc-macro \
bundled-rust-crate-arrayvec \
bundled-rust-crate-artem \
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
bundled-rust-crate-byteorder \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-color-quant \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colored \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-either \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-errno \
bundled-rust-crate-exr \
bundled-rust-crate-fdeflate \
bundled-rust-crate-flate2 \
bundled-rust-crate-flume \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-getrandom \
bundled-rust-crate-gif \
bundled-rust-crate-half \
bundled-rust-crate-heck \
bundled-rust-crate-html-escape \
bundled-rust-crate-humantime \
bundled-rust-crate-idna \
bundled-rust-crate-image \
bundled-rust-crate-image-webp \
bundled-rust-crate-imgref \
bundled-rust-crate-itertools \
bundled-rust-crate-jobserver \
bundled-rust-crate-jpeg-decoder \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lebe \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-loop9 \
bundled-rust-crate-maybe-rayon \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-new-debug-unreachable \
bundled-rust-crate-nom \
bundled-rust-crate-noop-proc-macro \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-derive \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-paste \
bundled-rust-crate-percent-encoding \
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
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rgb \
bundled-rust-crate-ring \
bundled-rust-crate-roff \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-scopeguard \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-simd-helpers \
bundled-rust-crate-smallvec \
bundled-rust-crate-spin \
bundled-rust-crate-strsim \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tiff \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-width \
bundled-rust-crate-untrusted \
bundled-rust-crate-ureq \
bundled-rust-crate-url \
bundled-rust-crate-utf8-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-v-frame \
bundled-rust-crate-wasm-bindgen \
bundled-rust-crate-wasm-bindgen-backend \
bundled-rust-crate-wasm-bindgen-macro \
bundled-rust-crate-wasm-bindgen-macro-support \
bundled-rust-crate-wasm-bindgen-shared \
bundled-rust-crate-webpki-roots \
bundled-rust-crate-weezl \
bundled-rust-crate-zeroize \
bundled-rust-crate-zune-core \
bundled-rust-crate-zune-inflate \
bundled-rust-crate-zune-jpeg"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
