SUMMARY = "Terminal IRC client written in Rust"
DESCRIPTION = "A terminal IRC client written in Rust."
LICENSE = "(Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (MIT | Unlicense) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT & MIT"

PV = "0.13.0+git5.g2ee969a"

RPM_NAME = "tiny-0.13.0+git5.g2ee969a-2.8.aarch64.rpm"
RPM_HASH = "767e74c226a1997360fa725521c27196db9e00e3d8af16bad075b4780dd75596987bb10c98e52551f901ec836e755cfc325762079231b82342259b9cb4821139"

RPROVIDES:${PN} += "bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-dbus \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-lite \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-indexmap \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libdbus-sys \
bundled-rust-crate-libtiny-client \
bundled-rust-crate-libtiny-common \
bundled-rust-crate-libtiny-logger \
bundled-rust-crate-libtiny-tui \
bundled-rust-crate-libtiny-wire \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memoffset \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-notify-rust \
bundled-rust-crate-numtoa \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-parking \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-ring \
bundled-rust-crate-rustc-tools-util \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-native-certs \
bundled-rust-crate-rustls-pemfile \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-ryu \
bundled-rust-crate-sct \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-shell-words \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-socket2 \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-term-input \
bundled-rust-crate-term-input-macros \
bundled-rust-crate-termbox-simple \
bundled-rust-crate-termion \
bundled-rust-crate-time \
bundled-rust-crate-tiny \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-rustls \
bundled-rust-crate-tokio-stream \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-untrusted \
bundled-rust-crate-yaml-rust \
tiny"

RDEPENDS:${PN} += "libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1"

inherit rpm
