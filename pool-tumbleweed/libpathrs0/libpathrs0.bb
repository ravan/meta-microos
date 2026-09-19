SUMMARY = "Shared library for libpathrs"
DESCRIPTION = "libpathrs implements a set of C-friendly APIs (written in Rust) to make path \
resolution within a potentially-untrusted directory safe on GNU/Linux. There \
are countless examples of security vulnerabilities caused by bad handling of \
paths (symlinks make the issue significantly worse)."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.2.6"

RPM_NAME = "libpathrs0-0.2.6-1.1.aarch64.rpm"
RPM_HASH = "78fa0a578c3c751159c12bdb08951d35372dc3dc6a7a71829af1e59b998cabbcd555ebf02377b90cffa0d4863fc16945db0d50d84c716807cece245fc3c16efc"

RPROVIDES:${PN} += "bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-bytemuck-derive \
bundled-rust-crate-cfg-if \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-getrandom \
bundled-rust-crate-itertools \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-once-cell \
bundled-rust-crate-open-enum \
bundled-rust-crate-open-enum-derive \
bundled-rust-crate-pathrs \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-static-assertions \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-zerocopy \
libpathrs \
libpathrs.so.0 \
libpathrs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
