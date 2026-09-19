SUMMARY = "Space repetition memoization for zk"
DESCRIPTION = "zk-spaced is a companion cli app to create space repetition memoization for zk."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "zk-spaced-1.0.0-2.14.aarch64.rpm"
RPM_HASH = "797fe3b9a2e89f9fb31e4e6febc5f1a646c57785e6f3b48ad61f3898986d7b7dcf25f0aada7053dbdd9b72a8bcb8557332818af0aabf7deadd5868eed992d86f"

RPROVIDES:${PN} += "bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cassowary \
bundled-rust-crate-cfg-if \
bundled-rust-crate-crossterm \
bundled-rust-crate-deranged \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-mio \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-syn \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tui \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-xdg \
bundled-rust-crate-zk-spaced \
zk-spaced"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
zk"

inherit rpm
