SUMMARY = "Generate random passphrases"
DESCRIPTION = "Generate random passphrases"
LICENSE = "MPL-2.0"

PV = "0.3.28"

RPM_NAME = "phraze-0.3.28-1.2.aarch64.rpm"
RPM_HASH = "f51f8c392556d10a265f461441f04a8d5a9af3007d55e940bc57f657962ab5e31dee8ef3c5278aa43fbfcba5e3bef8295481e5d65acc87baedc1134ccb29e185"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chacha20 \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-colorchoice \
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-include-lines \
bundled-rust-crate-include-lines-proc \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-phraze \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-core \
bundled-rust-crate-roff \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-utf8parse \
phraze"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
