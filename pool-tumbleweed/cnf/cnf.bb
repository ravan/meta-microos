SUMMARY = "A command-not-found handler for openSUSE"
DESCRIPTION = "A libsolv based command-not-found handler for openSUSE."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "cnf-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "e6211b08e8eed8e45f8539ec0f1ee4de5bdc86cc5a32dda177754c91c17b0222117d3d410f5099c2118cd0120b2e79dcb3431f7b898fcf69923d77a18f2c2cc4"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clang-sys \
bundled-rust-crate-cnf \
bundled-rust-crate-either \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-gettext-rs \
bundled-rust-crate-gettext-sys \
bundled-rust-crate-glob \
bundled-rust-crate-itertools \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-locale-config \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nom \
bundled-rust-crate-prettyplease \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-shlex \
bundled-rust-crate-syn \
bundled-rust-crate-temp-dir \
bundled-rust-crate-tr \
bundled-rust-crate-unicode-ident \
cnf \
cnf-rs \
command-not-found \
scout-command-not-found"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libsolv.so.1"

inherit rpm
