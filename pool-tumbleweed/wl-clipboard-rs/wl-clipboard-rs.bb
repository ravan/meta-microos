SUMMARY = "Wayland Clipboard Utility in Rust"
DESCRIPTION = "A safe Rust crate for working with the Wayland clipboard."
LICENSE = "Apache-2.0 & MIT"

PV = "0.9.2"

RPM_NAME = "wl-clipboard-rs-0.9.2-1.7.aarch64.rpm"
RPM_HASH = "f9f8d17ce64996a97fe2b76e6d2d0b7fe98aedba3e93a461fde917896062a278e4f46a01da3cedb6948f28ae892fa07e1f45233ff5a1240872c5f1601f3494ea"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-colorchoice \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mime \
bundled-rust-crate-mime-guess \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nom \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-pipe \
bundled-rust-crate-petgraph \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-roff \
bundled-rust-crate-rustix \
bundled-rust-crate-shlex \
bundled-rust-crate-smallvec \
bundled-rust-crate-stderrlog \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tree-magic-mini \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-wayland-backend \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-protocols-wlr \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-server \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-wl-clipboard-rs \
bundled-rust-crate-wl-clipboard-rs-tools \
wl-clipboard-rs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
