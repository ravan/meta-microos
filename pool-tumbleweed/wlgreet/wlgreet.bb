SUMMARY = "Raw wayland greeter for greetd"
DESCRIPTION = "Raw wayland greeter for greetd, to be run under sway or similar. \
Note that cage is currently not supported due to it lacking wlr-layer-shell-unstable support."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "wlgreet-0.5.0-1.12.aarch64.rpm"
RPM_HASH = "629c5868a9795bc473de790266f3b6cacb58d128e3c692e20b55f3c07f22534f8de077b7ebb251a559a0391251fb2bf07542d392c0c8d260adf1c472db8fb25b"

RPROVIDES:${PN} += "bundled-rust-crate-ab-glyph-rasterizer \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-calloop \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-dlib \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-getopts \
bundled-rust-crate-greetd-ipc \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-log \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memoffset \
bundled-rust-crate-nix \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-pipe \
bundled-rust-crate-owned-ttf-parser \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rusttype \
bundled-rust-crate-ryu \
bundled-rust-crate-scoped-tls \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-smallvec \
bundled-rust-crate-smithay-client-toolkit \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-toml \
bundled-rust-crate-ttf-parser \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-commons \
bundled-rust-crate-wayland-cursor \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-wlgreet \
bundled-rust-crate-xcursor \
bundled-rust-crate-xml-rs \
wlgreet"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
