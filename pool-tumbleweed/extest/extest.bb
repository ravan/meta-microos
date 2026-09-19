SUMMARY = "X11 XTEST reimplementation primarily for Steam Controller on Wayland"
DESCRIPTION = "Extest is a drop in replacement for the X11 XTEST extension. \
It creates a virtual device with the uinput kernel module. \
It's been primarily developed for allowing the desktop functionality \
on the Steam Controller to work while Steam is open on Wayland."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "extest-1.0.3-1.2.aarch64.rpm"
RPM_HASH = "51e04aef0003f59652289be87d0805d20bd307fae3ad9456b714532b2ec378fd588dc1faa35d1d8c4adf7146ada316000fa65cea9bb373b5005446c14a9163c5"

RPROVIDES:${PN} += "bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitvec \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-dlib \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-evdev \
bundled-rust-crate-extest \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-funty \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-nix \
bundled-rust-crate-once-cell \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-radium \
bundled-rust-crate-scoped-tls \
bundled-rust-crate-shlex \
bundled-rust-crate-smallvec \
bundled-rust-crate-tap \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-wayland-backend \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-wyz \
extest \
libextest.so"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
