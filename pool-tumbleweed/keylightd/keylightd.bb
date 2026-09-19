SUMMARY = "Keyboard backlight daemon for the Framework Laptop"
DESCRIPTION = "keylightd is a system daemon for Framework laptops that listens to \
keyboard and touchpad input, and turns on the keyboard backlight \
while either is being used."
LICENSE = "ISC"

PV = "1+git20240806.b7b17e3"

RPM_NAME = "keylightd-1+git20240806.b7b17e3-3.2.aarch64.rpm"
RPM_HASH = "7f538d41b6eba82fac06c2969b11b7f7651441de363daa97bedfb8389f34fd3001098345a72849bc5c9642b858e7b1d60552c14bad33b1f3237fc27be868a189"

RPROVIDES:${PN} += "bundled-rust-crate-anyhow \
bundled-rust-crate-argh \
bundled-rust-crate-argh-derive \
bundled-rust-crate-argh-shared \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitvec \
bundled-rust-crate-bytemuck \
bundled-rust-crate-bytemuck-derive \
bundled-rust-crate-cfg-if \
bundled-rust-crate-env-logger \
bundled-rust-crate-evdev \
bundled-rust-crate-funty \
bundled-rust-crate-humantime \
bundled-rust-crate-is-terminal \
bundled-rust-crate-keylightd \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-memoffset \
bundled-rust-crate-nix \
bundled-rust-crate-pin-utils \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-radium \
bundled-rust-crate-rust-fuzzy-search \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-syn \
bundled-rust-crate-tap \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-wyz \
keylightd"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
