SUMMARY = "Terminal confirmation prompt that prevents you from shutting down remote hosts"
DESCRIPTION = "Boulette prevents you from accidentally damaging remote hosts by raising a \
warning prompt on dangerous commands. The prompt simply asks for user \
confirmation, and can also enforce a challenge resolution to decide whether to \
resume(or abort) the command."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "boulette-0.2.3-1.10.aarch64.rpm"
RPM_HASH = "0f30dbbef02f07c91899e048b4a59278877ea336925cc0638eef390cd70a5d3cb7d777d6ac1e7a820d012062880cf36564c1e7cac19c1cefab3e8a2fcb301c47"

RPROVIDES:${PN} += "boulette \
bundled-rust-crate-addr2line \
bundled-rust-crate-adler2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-backtrace-ext \
bundled-rust-crate-bitflags \
bundled-rust-crate-bon \
bundled-rust-crate-bon-macros \
bundled-rust-crate-boulette \
bundled-rust-crate-byteorder \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-dyn-clone \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-fnv \
bundled-rust-crate-fuzzy-matcher \
bundled-rust-crate-fxhash \
bundled-rust-crate-gethostname \
bundled-rust-crate-gimli \
bundled-rust-crate-heck \
bundled-rust-crate-ident-case \
bundled-rust-crate-inquire \
bundled-rust-crate-is-ci \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miette \
bundled-rust-crate-miette-derive \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-newline-converter \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-owo-colors \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-prettyplease \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-scopeguard \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-supports-color \
bundled-rust-crate-supports-hyperlinks \
bundled-rust-crate-supports-unicode \
bundled-rust-crate-syn \
bundled-rust-crate-sysinfo \
bundled-rust-crate-terminal-size \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-linebreak \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
