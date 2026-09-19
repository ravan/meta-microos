SUMMARY = "Screen region selector for wayland compositors"
DESCRIPTION = "A screen region selection tool like slurp but with added dynamic labels of region dimensions and size."
LICENSE = "MIT"

PV = "0.4.0+git4.g258306c43bc79705635f1ee1d607cc3c3d483b59"

RPM_NAME = "waysip-0.4.0+git4.g258306c43bc79705635f1ee1d607cc3c3d483b59-1.8.aarch64.rpm"
RPM_HASH = "e635b1167c3d84091e4e74c725e915c1a66461e114b9bcd4b87147e9d3dfd4b65b98a93721d12d5a13168528175a541785d800b23405a28bbedc1cb52bda7f5f"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-bitflags \
bundled-rust-crate-cairo-rs \
bundled-rust-crate-cairo-sys-rs \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-expr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-gio \
bundled-rust-crate-gio-sys \
bundled-rust-crate-glib \
bundled-rust-crate-glib-macros \
bundled-rust-crate-glib-sys \
bundled-rust-crate-gobject-sys \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libwaysip \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-once-cell \
bundled-rust-crate-overload \
bundled-rust-crate-pango \
bundled-rust-crate-pango-sys \
bundled-rust-crate-pangocairo \
bundled-rust-crate-pangocairo-sys \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-rustix \
bundled-rust-crate-serde \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-system-deps \
bundled-rust-crate-target-lexicon \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-compare \
bundled-rust-crate-wayland-backend \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-cursor \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-protocols-wlr \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-waysip \
bundled-rust-crate-winnow \
bundled-rust-crate-xcursor \
waysip"

RDEPENDS:${PN} += "libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
