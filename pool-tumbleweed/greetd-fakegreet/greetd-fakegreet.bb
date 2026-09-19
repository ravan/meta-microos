SUMMARY = "Test utility for greeter development"
DESCRIPTION = "fakegreet is a test utility that allows launching greeters without greetd daemon."
LICENSE = "GPL-3.0-only"

PV = "0.10.3"

RPM_NAME = "greetd-fakegreet-0.10.3-2.8.aarch64.rpm"
RPM_HASH = "1899ca5df9dce3df89f4412e074f6bf520dbb462aab6057b6c2fc7484bed41ceed7848b905020fd56878d2f173b844f5fe01cc62ac4543ccf1acaa8330a1fc28"

RPROVIDES:${PN} += "bundled-rust-crate-async-trait \
bundled-rust-crate-bytes \
bundled-rust-crate-fakegreet \
bundled-rust-crate-greetd-ipc \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-mio \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
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
greetd-fakegreet"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
