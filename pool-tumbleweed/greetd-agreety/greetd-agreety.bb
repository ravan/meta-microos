SUMMARY = "A text-based greeter for greetd"
DESCRIPTION = "agreety is a very simple text-based greeter, with an appearance similar to agetty and login."
LICENSE = "GPL-3.0-only"

PV = "0.10.3"

RPM_NAME = "greetd-agreety-0.10.3-2.8.aarch64.rpm"
RPM_HASH = "f5adf297c2933d4276603e9f4a850c66965992657e2222c8aeb3b0657dde2194999d5ae51c0a7b10e7d61ca7f807e824f5cf06b120960cbf8956bf953d5befa2"

RPROVIDES:${PN} += "bundled-rust-crate-agreety \
bundled-rust-crate-async-trait \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-if \
bundled-rust-crate-enquote \
bundled-rust-crate-getopts \
bundled-rust-crate-greetd-ipc \
bundled-rust-crate-inish \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rpassword \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-socket2 \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
greetd-agreety"

RDEPENDS:${PN} += "greetd \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
