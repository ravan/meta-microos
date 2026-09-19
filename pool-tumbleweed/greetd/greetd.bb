SUMMARY = "Minimal and flexible login manager daemon"
DESCRIPTION = "greetd is a login manager daemon. greetd on its own does not have any user interface, \
but instead offloads that to greeters, which are arbitrary applications that implement the greetd IPC protocol."
LICENSE = "GPL-3.0-only"

PV = "0.10.3"

RPM_NAME = "greetd-0.10.3-2.8.aarch64.rpm"
RPM_HASH = "b1a69d19a572a896e869d043de9f6f66d96884b7110a4e1e75a09a0cff094f54e374085f0c5ed54899527a01b01d599ac42e6e572170dcf1587a6af32c384a38"

RPROVIDES:${PN} += "bundled-rust-crate-async-trait \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-if \
bundled-rust-crate-enquote \
bundled-rust-crate-getopts \
bundled-rust-crate-greetd \
bundled-rust-crate-greetd-ipc \
bundled-rust-crate-inish \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-pam-sys \
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
bundled-rust-crate-unicode-width \
greetd"

RDEPENDS:${PN} += "/usr/bin/sh \
greetd-branding \
group-greeter \
libc.so.6 \
libgcc-s.so.1 \
libpam-misc.so.0 \
libpam.so.0 \
pam \
user-greeter"

inherit rpm
