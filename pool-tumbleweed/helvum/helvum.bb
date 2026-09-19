SUMMARY = "A GTK patchbay for pipewire"
DESCRIPTION = "Helvum is a GTK-based patchbay for pipewire, inspired by the JACK tool catia."
LICENSE = "GPL-3.0-only & ( (MIT | Apache-2.0) & Unicode-DFS-2016 ) & ( Apache-2.0 | MIT ) & ( Unlicense | MIT ) & Apache-2.0 & Apache-2.0-with-LLVM-exception & BSD-3-Clause & ISC & MIT AND"

PV = "0.6.1"

RPM_NAME = "helvum-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "b50cd8504881149d63b3703f6b413d291eccd35226cb5a28643e16b03836465597c870581e430824eddc80161fa05cb3d845729aab167988ec78afc9e8582331"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-annotate-snippets \
bundled-rust-crate-anstyle \
bundled-rust-crate-anyhow \
bundled-rust-crate-async-channel \
bundled-rust-crate-autocfg \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-cairo-rs \
bundled-rust-crate-cairo-sys-rs \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-expr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clang-sys \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-convert-case \
bundled-rust-crate-cookie-factory \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-event-listener \
bundled-rust-crate-event-listener-strategy \
bundled-rust-crate-field-offset \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
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
bundled-rust-crate-glob \
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
bundled-rust-crate-helvum \
bundled-rust-crate-indexmap \
bundled-rust-crate-itertools \
bundled-rust-crate-libadwaita \
bundled-rust-crate-libadwaita-sys \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-libspa \
bundled-rust-crate-libspa-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-once-cell \
bundled-rust-crate-pango \
bundled-rust-crate-pango-sys \
bundled-rust-crate-parking \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pipewire \
bundled-rust-crate-pipewire-sys \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustc-version \
bundled-rust-crate-semver \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-shlex \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-syn \
bundled-rust-crate-system-deps \
bundled-rust-crate-target-lexicon \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-version-compare \
bundled-rust-crate-winnow \
helvum"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpipewire-0.3.so.0"

inherit rpm
