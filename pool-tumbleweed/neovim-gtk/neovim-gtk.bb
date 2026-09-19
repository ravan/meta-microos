SUMMARY = "GTK UI for Neovim"
DESCRIPTION = "GTK UI for Neovim written in Rust using gtk-rs bindings. With ligatures \
support."
LICENSE = "GPL-3.0-only"

PV = "1.0.1+279"

RPM_NAME = "neovim-gtk-1.0.1+279-2.2.aarch64.rpm"
RPM_HASH = "858aa34ebb276e9270eac2cc93f6f646e3ca40e2af39451257672dd3b0c160ac20d007939ff8ae63a2aae47810a514cf1449f5c8c083a7d595e0c93de6707fd7"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-async-trait \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-build-version \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-cairo-rs \
bundled-rust-crate-cairo-sys-rs \
bundled-rust-crate-cfg-expr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-field-offset \
bundled-rust-crate-fnv \
bundled-rust-crate-fork \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-gdk-pixbuf \
bundled-rust-crate-gdk-pixbuf-sys \
bundled-rust-crate-gdk4 \
bundled-rust-crate-gdk4-sys \
bundled-rust-crate-gio \
bundled-rust-crate-gio-sys \
bundled-rust-crate-glib \
bundled-rust-crate-glib-macros \
bundled-rust-crate-glib-sys \
bundled-rust-crate-gobject-sys \
bundled-rust-crate-graphene-rs \
bundled-rust-crate-graphene-sys \
bundled-rust-crate-gsk4 \
bundled-rust-crate-gsk4-sys \
bundled-rust-crate-gtk4 \
bundled-rust-crate-gtk4-macros \
bundled-rust-crate-gtk4-sys \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-html-escape \
bundled-rust-crate-indexmap \
bundled-rust-crate-iovec \
bundled-rust-crate-is-terminal \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jiff \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mio \
bundled-rust-crate-num-traits \
bundled-rust-crate-nvim-gtk \
bundled-rust-crate-nvim-rs \
bundled-rust-crate-once-cell \
bundled-rust-crate-pango \
bundled-rust-crate-pango-sys \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-phf \
bundled-rust-crate-phf-codegen \
bundled-rust-crate-phf-generator \
bundled-rust-crate-phf-shared \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-error \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rmp \
bundled-rust-crate-rmpv \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-bytes \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-siphasher \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-system-deps \
bundled-rust-crate-target-lexicon \
bundled-rust-crate-terminal-size \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-io \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-util \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-compare \
bundled-rust-crate-winnow \
bundled-rust-crate-zmij \
neovim-gtk"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
neovim"

inherit rpm
