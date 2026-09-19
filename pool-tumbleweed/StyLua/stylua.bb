SUMMARY = "Opinionated Lua code formatter"
DESCRIPTION = "StyLua is an opinonated code formatter for Lua 5.1, 5.2, 5.3, 5.4 and Luau \
built using full-moon. StyLua is inspired by the likes of prettier, it \
parses your Lua codebase, and prints it back out from scratch, enforcing a \
consistent code style."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Unlicense) & Apache-2.0 & MIT & MPL-2.0 & MPL-2.0"

PV = "2.0.2"

RPM_NAME = "StyLua-2.0.2-1.11.aarch64.rpm"
RPM_HASH = "dc4467e7268b282cc0e8932a181c654d0e8f3f5b8a112fd2788c6ed30b2733d23daebfc8971be6b833cfd9a399bcc30c601430766d40e344138793ebff5a94c5"

RPROVIDES:${PN} += "StyLua \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-borsh \
bundled-rust-crate-bstr \
bundled-rust-crate-bytecount \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-console \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-ec4rs \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-full-moon \
bundled-rust-crate-full-moon-derive \
bundled-rust-crate-globset \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-ignore \
bundled-rust-crate-indexmap \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-num-cpus \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-paste \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-similar \
bundled-rust-crate-smol-str \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-stylua \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-threadpool \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-winnow"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
