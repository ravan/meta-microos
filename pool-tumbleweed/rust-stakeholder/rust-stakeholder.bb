SUMMARY = "Terminal output generator"
DESCRIPTION = "This package generates impressive-looking terminal output to look busy when \
stakeholders walk by."
LICENSE = "MIT"

PV = "20250316"

RPM_NAME = "rust-stakeholder-20250316-1.8.aarch64.rpm"
RPM_HASH = "7167ea1fe5524dec50509685b77b55af3d8ee47802c7d8af4fcb4dfe51a86387b8bc69aa8deb67bad6110c1301eafe5eb348846f892bae68fa04d2c70065dbd4"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colored \
bundled-rust-crate-console \
bundled-rust-crate-ctrlc \
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-indicatif \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-nix \
bundled-rust-crate-number-prefix \
bundled-rust-crate-once-cell \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rust-stakeholder \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-zerocopy \
rust-stakeholder"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
