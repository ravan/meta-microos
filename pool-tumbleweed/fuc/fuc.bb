SUMMARY = "Modern unix commands focused on performance"
DESCRIPTION = "The FUC-ing project provides modern unix commands focused on performance. \
This package provides the commands 'rmz' and 'cpz', with a CLI interface \
compatible with 'rm' and 'cp', respectively, in a 'zippy' faster version."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "fuc-3.2.0-1.3.aarch64.rpm"
RPM_HASH = "49af75f1bbc25eb7986effa47b28de17433f1ccf5e78085d3a2560d06b85b2df9e6d5b27edc38a46456420a05ebca4687bc5a6d2004eb74ecaeef6be32e6b657"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-bitflags \
bundled-rust-crate-bon \
bundled-rust-crate-bon-macros \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-cpz \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-errno \
bundled-rust-crate-error-stack \
bundled-rust-crate-fuc-engine \
bundled-rust-crate-heck \
bundled-rust-crate-ident-case \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-once-cell \
bundled-rust-crate-prettyplease \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rmz \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-semver \
bundled-rust-crate-serde-core \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
fuc"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
