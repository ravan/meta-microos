SUMMARY = "SVG simplification tool"
DESCRIPTION = "usvg is a command-line utility to simplify SVG files based on a static \
SVG Full 1.1 subset. It converts an input SVG to an extremely \
simple representation, which is still a valid SVG: \
* No basic shapes (rect, circle, etc), only paths \
* Only simple paths \
* All supported attributes are resolved \
* Invisible elements are removed \
* Comments will be removed \
* DTD will be resolved \
* CSS will be resolved \
and so on."
LICENSE = "Apache-2.0 | MIT"

PV = "0.48.1"

RPM_NAME = "usvg-0.48.1-1.2.aarch64.rpm"
RPM_HASH = "4ca6283d99b700c437633bf1216f39d1533a7db4da5770fa9c98c6a5c3a89adf977f3dd858b1beda62968b75a838c433c12679cc4179a653fbdf5e71af525c53"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-bytemuck-derive \
bundled-rust-crate-cfg-if \
bundled-rust-crate-crc32fast \
bundled-rust-crate-data-url \
bundled-rust-crate-euclid \
bundled-rust-crate-flate2 \
bundled-rust-crate-float-cmp \
bundled-rust-crate-font-types \
bundled-rust-crate-fontconfig-parser \
bundled-rust-crate-fontdb \
bundled-rust-crate-harfrust \
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
bundled-rust-crate-polycool \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-read-fonts \
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
bundled-rust-crate-tiny-skia-path \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-script \
bundled-rust-crate-unicode-vo \
bundled-rust-crate-usvg \
bundled-rust-crate-version-check \
bundled-rust-crate-xmlwriter \
usvg"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
