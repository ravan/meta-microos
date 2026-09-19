SUMMARY = "A human-friendly and fast alternative to cut and (sometimes) awk"
DESCRIPTION = "A human-friendly and fast alternative to cut and (sometimes) awk."
LICENSE = "MIT"

PV = "1.3.7"

RPM_NAME = "choose-1.3.7-1.8.aarch64.rpm"
RPM_HASH = "fce07cf65d61cc4d53c06d2b9257567e4df439d870bed31cd3d660461975da8c9fe6e8501b69a9c7907a026f2175863fce18a3ede4a5632044d56c598119af60"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-atty \
bundled-rust-crate-backslash \
bundled-rust-crate-bitflags \
bundled-rust-crate-choose \
bundled-rust-crate-clap \
bundled-rust-crate-heck \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-memchr \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-strsim \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-syn \
bundled-rust-crate-textwrap \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-vec-map \
bundled-rust-crate-version-check \
choose"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
