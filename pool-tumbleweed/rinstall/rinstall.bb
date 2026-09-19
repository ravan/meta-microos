SUMMARY = "Declarative install for programs"
DESCRIPTION = "A helper tool that installs software and additional data into the system."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.0"

RPM_NAME = "rinstall-0.2.0-4.12.aarch64.rpm"
RPM_HASH = "3b8b1e71fa7fa6119aeaf1a32cd659100bef9145800860334e7e5086a97f8a511538c45285f648b260cebe1c8bc9a540cc80aaa2be193ba11dfe47634077691c"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-bitflags \
bundled-rust-crate-blake3 \
bundled-rust-crate-block-buffer \
bundled-rust-crate-camino \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-color-eyre \
bundled-rust-crate-colored \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-crypto-common \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-eyre \
bundled-rust-crate-generic-array \
bundled-rust-crate-gimli \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indenter \
bundled-rust-crate-indexmap \
bundled-rust-crate-json \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-owo-colors \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rinstall \
bundled-rust-crate-roff \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-strsim \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-textwrap \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-version-check \
bundled-rust-crate-void \
bundled-rust-crate-walkdir \
bundled-rust-crate-xdg \
bundled-rust-crate-yaml-rust \
rinstall \
rpm-macro-rinstall"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
