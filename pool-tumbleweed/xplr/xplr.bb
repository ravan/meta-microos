SUMMARY = "TUI file explorer"
DESCRIPTION = "xplr is a terminal UI based file explorer for command-line utilities \
that work with the file-system. \
 \
xplr integrates shell commands and GUI file managers and exposes a \
scriptable, keyboard-controlled, real-time visual interface."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xplr-1.0.1-1.9.aarch64.rpm"
RPM_HASH = "b3730657b4a361641b4e07129095008ae626e95ce08bd5cb4ef37646e3e22ac98e379e8f95ef26efd749f58d70f8854151a5248a236d522a9dceb84ccc709f4e"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-ansi-to-tui \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-beef \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cassowary \
bundled-rust-crate-castaway \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-compact-str \
bundled-rust-crate-crossbeam \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-defer-drop \
bundled-rust-crate-deranged \
bundled-rust-crate-derive-builder \
bundled-rust-crate-derive-builder-core \
bundled-rust-crate-derive-builder-macro \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-either \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-home \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-erased-serde \
bundled-rust-crate-errno \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-fuzzy-matcher \
bundled-rust-crate-gethostname \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-home \
bundled-rust-crate-humansize \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ident-case \
bundled-rust-crate-indexmap \
bundled-rust-crate-indoc \
bundled-rust-crate-instability \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jf \
bundled-rust-crate-jiff \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lru \
bundled-rust-crate-lscolors \
bundled-rust-crate-lua-src \
bundled-rust-crate-luajit-src \
bundled-rust-crate-memchr \
bundled-rust-crate-mime \
bundled-rust-crate-mime-guess \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-mio \
bundled-rust-crate-mlua \
bundled-rust-crate-mlua-sys \
bundled-rust-crate-natord \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-ordered-float \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-path-absolutize \
bundled-rust-crate-path-dedot \
bundled-rust-crate-pkg-config \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pulldown-cmark \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-ratatui \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-value \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-shell-quote \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simdutf8 \
bundled-rust-crate-skim \
bundled-rust-crate-skim-common \
bundled-rust-crate-skim-tuikit \
bundled-rust-crate-smallvec \
bundled-rust-crate-smawk \
bundled-rust-crate-snailquote \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-term \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-timer \
bundled-rust-crate-tui-input \
bundled-rust-crate-typeid \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-categories \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-linebreak \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-truncate \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vte \
bundled-rust-crate-which \
bundled-rust-crate-xdg \
bundled-rust-crate-xplr \
bundled-rust-crate-zerocopy \
config-xplr \
xplr"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
