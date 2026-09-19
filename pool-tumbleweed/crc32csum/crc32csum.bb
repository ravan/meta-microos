SUMMARY = "A tool to calculate crc32c of files."
DESCRIPTION = "This is for fast verification only - crc32c is NOT a cryptographic verification"
LICENSE = "( Apache-2.0 | MIT ) & MIT & MPL-2.0 & MPL-2.0+"

PV = "0.1.0~0"

RPM_NAME = "crc32csum-0.1.0~0-1.17.aarch64.rpm"
RPM_HASH = "4b0206db0d53b817a4f7b1831492d3afd6a59d7afd6b7594699ecc2de2bfbb15eb9ca1fd071591b784af006165e4772d2f5146112c97fde2d3398f1e8645906d"

RPROVIDES:${PN} += "bundled-rust-crate-bitflags \
bundled-rust-crate-clap \
bundled-rust-crate-crc32c \
bundled-rust-crate-crc32csum \
bundled-rust-crate-heck \
bundled-rust-crate-lazy-static \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustc-version \
bundled-rust-crate-semver \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-syn \
bundled-rust-crate-textwrap \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-version-check \
crc32csum"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
