SUMMARY = "Tool for lossy compression of PNG images"
DESCRIPTION = "pngquant is a command-line utility and a library for lossy \
compression of PNG images. \
 \
The conversion reduces file sizes by converting images to 1/2/4/8-bit \
paletted PNG format with alpha channel (often 60-80% smaller than \
24/32-bit PNG files). Generated images are compatible with all modern \
web browsers, and have better fallback in IE6 than 24-bit PNGs."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.3"

RPM_NAME = "pngquant-3.0.3-1.9.aarch64.rpm"
RPM_HASH = "653aed3232fd656ce3a2497f51709037fded2b8c21d8d753deb199d9d763b819f04ae8fbf3f65ba3af006822195d4af931927dfdc8ec3098db597cef92563b4e"

RPROVIDES:${PN} += "bundled-rust-crate-arrayvec \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-dunce \
bundled-rust-crate-either \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-getopts \
bundled-rust-crate-imagequant \
bundled-rust-crate-imagequant-sys \
bundled-rust-crate-jobserver \
bundled-rust-crate-lcms2-sys \
bundled-rust-crate-libc \
bundled-rust-crate-libpng-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-once-cell \
bundled-rust-crate-pkg-config \
bundled-rust-crate-pngquant \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rgb \
bundled-rust-crate-shlex \
bundled-rust-crate-thread-local \
bundled-rust-crate-unicode-width \
bundled-rust-crate-vcpkg \
bundled-rust-crate-wild \
pngquant"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16"

inherit rpm
