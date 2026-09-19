SUMMARY = "SVG rendering library"
DESCRIPTION = "resvg is an SVG rendering library. \
It can be used as a Rust library, as a C library, and as a CLI \
application to render static SVG files. \
The core idea is to make a fast, small, portable SVG library with the goal to \
support the whole SVG spec. \
Features: \
* Designed for edge-cases \
* Safety \
* Zero bloat \
* Portable \
* SVG preprocessing \
* Performance \
* Reproducibility"
LICENSE = "Apache-2.0 | MIT"

PV = "0.48.1"

RPM_NAME = "resvg-0.48.1-1.2.aarch64.rpm"
RPM_HASH = "b065db425b763207ad4d85dd1d854e0f58a8c9395eee62a04bbade8ac79f605d9fa33b8816cf0cb6e76c2f5aa93ecdab2fa0ae38c499a73b663b9e8c6934dd20"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-bytemuck-derive \
bundled-rust-crate-byteorder-lite \
bundled-rust-crate-cfg-if \
bundled-rust-crate-color-quant \
bundled-rust-crate-crc32fast \
bundled-rust-crate-data-url \
bundled-rust-crate-euclid \
bundled-rust-crate-fdeflate \
bundled-rust-crate-flate2 \
bundled-rust-crate-float-cmp \
bundled-rust-crate-font-types \
bundled-rust-crate-fontconfig-parser \
bundled-rust-crate-fontdb \
bundled-rust-crate-gif \
bundled-rust-crate-harfrust \
bundled-rust-crate-image-webp \
bundled-rust-crate-imagesize \
bundled-rust-crate-kurbo \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-pico-args \
bundled-rust-crate-png \
bundled-rust-crate-polycool \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-error \
bundled-rust-crate-quote \
bundled-rust-crate-read-fonts \
bundled-rust-crate-resvg \
bundled-rust-crate-rgb \
bundled-rust-crate-roxmltree \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-simplecss \
bundled-rust-crate-siphasher \
bundled-rust-crate-skrifa \
bundled-rust-crate-slotmap \
bundled-rust-crate-smallvec \
bundled-rust-crate-strict-num \
bundled-rust-crate-svgtypes \
bundled-rust-crate-syn \
bundled-rust-crate-tiny-skia \
bundled-rust-crate-tiny-skia-path \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-script \
bundled-rust-crate-unicode-vo \
bundled-rust-crate-usvg \
bundled-rust-crate-version-check \
bundled-rust-crate-weezl \
bundled-rust-crate-xmlwriter \
bundled-rust-crate-zune-core \
bundled-rust-crate-zune-jpeg \
resvg"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
