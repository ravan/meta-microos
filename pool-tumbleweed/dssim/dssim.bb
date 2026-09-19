SUMMARY = "This tool computes (dis)similarity between two (or more) PNG images"
DESCRIPTION = "This tool computes (dis)similarity between two PNG images using \
(my approximation of) algorithms approximating human vision."
LICENSE = "AGPL-3.0-only & (BSD-2-Clause & AOMPL-1.0) & Apache-2.0 & BSD-2-Clause & (MIT | Apache2) & MIT & VP8 & MPL-2.0 & Apache-2.0-with-LLVM-exception"

PV = "3.2.3"

RPM_NAME = "dssim-3.2.3-2.13.aarch64.rpm"
RPM_HASH = "a191d0ec8784c6be57be3526ef3749386644cfb794dabc427895a5750b8622df2cb6e2423659deb93b9e92616b08a42bc980968d47c15bd58f1909ebf7601a3a"

RPROVIDES:${PN} += "bundled-rust-crate-adler \
bundled-rust-crate-ahash \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-bytemuck \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-dssim \
bundled-rust-crate-dssim-core \
bundled-rust-crate-dunce \
bundled-rust-crate-either \
bundled-rust-crate-fallible-collections \
bundled-rust-crate-flate2 \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-macros \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-getopts \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-imgref \
bundled-rust-crate-itertools \
bundled-rust-crate-jobserver \
bundled-rust-crate-lcms2 \
bundled-rust-crate-lcms2-sys \
bundled-rust-crate-libc \
bundled-rust-crate-load-image \
bundled-rust-crate-lodepng \
bundled-rust-crate-memoffset \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mozjpeg \
bundled-rust-crate-mozjpeg-sys \
bundled-rust-crate-nasm-rs \
bundled-rust-crate-num \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-complex \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-iter \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rexif \
bundled-rust-crate-rgb \
bundled-rust-crate-scopeguard \
bundled-rust-crate-syn \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-version-check \
dssim"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
