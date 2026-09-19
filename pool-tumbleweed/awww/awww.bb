SUMMARY = "Wallpaper daemon for Wayland"
DESCRIPTION = "awww is a wallpaper daemon for Wayland that is controlled \
at runtime. It uses LZ4 compression for frame animations \
for animated wallpapers."
LICENSE = "GPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "awww-0.12.0-1.5.aarch64.rpm"
RPM_HASH = "f2cfd945b1d5c2f6d518f14088c55fd2f8b63c4a8792955b867083fcefb05920620154d8bdcf6305f8d01ea50c00631e45cbc4fafa127bcc92d9abd7763ee1b1"

RPROVIDES:${PN} += "awww \
bundled-rust-crate-adler2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-awww \
bundled-rust-crate-awww-daemon \
bundled-rust-crate-base64 \
bundled-rust-crate-bit-field \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder-lite \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-quant \
bundled-rust-crate-colorchoice \
bundled-rust-crate-common \
bundled-rust-crate-core-maths \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-data-url \
bundled-rust-crate-document-features \
bundled-rust-crate-errno \
bundled-rust-crate-euclid \
bundled-rust-crate-exr \
bundled-rust-crate-fast-image-resize \
bundled-rust-crate-fastrand \
bundled-rust-crate-fax \
bundled-rust-crate-fax-derive \
bundled-rust-crate-fdeflate \
bundled-rust-crate-flate2 \
bundled-rust-crate-float-cmp \
bundled-rust-crate-fontconfig-parser \
bundled-rust-crate-fontdb \
bundled-rust-crate-gif \
bundled-rust-crate-half \
bundled-rust-crate-heck \
bundled-rust-crate-image \
bundled-rust-crate-image-webp \
bundled-rust-crate-imagesize \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-jzon \
bundled-rust-crate-kurbo \
bundled-rust-crate-lebe \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litrs \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-moxcms \
bundled-rust-crate-num-traits \
bundled-rust-crate-pico-args \
bundled-rust-crate-pkg-config \
bundled-rust-crate-png \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pxfm \
bundled-rust-crate-qoi \
bundled-rust-crate-quick-error \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-resvg \
bundled-rust-crate-rgb \
bundled-rust-crate-roxmltree \
bundled-rust-crate-rustix \
bundled-rust-crate-rustybuzz \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-simplecss \
bundled-rust-crate-siphasher \
bundled-rust-crate-slotmap \
bundled-rust-crate-smallvec \
bundled-rust-crate-strict-num \
bundled-rust-crate-strsim \
bundled-rust-crate-svgtypes \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tiff \
bundled-rust-crate-tiny-skia \
bundled-rust-crate-tiny-skia-path \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-ttf-parser \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-bidi-mirroring \
bundled-rust-crate-unicode-ccc \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-properties \
bundled-rust-crate-unicode-script \
bundled-rust-crate-unicode-vo \
bundled-rust-crate-usvg \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-waybackend \
bundled-rust-crate-waybackend-scanner \
bundled-rust-crate-weezl \
bundled-rust-crate-xmlwriter \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
bundled-rust-crate-zune-core \
bundled-rust-crate-zune-inflate \
bundled-rust-crate-zune-jpeg \
swww"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
libm.so.6"

inherit rpm
