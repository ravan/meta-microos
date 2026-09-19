SUMMARY = "A man page generator for markdown markup files"
DESCRIPTION = "Mandown is a tool that generates man pages from markdown markup files."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "mandown-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "4ce7c506b2c10a9105aaff57bdab6a8b93a0cb23820b27c3ef447867e9c81758ca50eaa3c9cbc4863cae8e0f519bf721b524de2213c49ff86740f8035965deda"

RPROVIDES:${PN} += "bundled-rust-crate-bitflags \
bundled-rust-crate-deunicode \
bundled-rust-crate-getopts \
bundled-rust-crate-mandown \
bundled-rust-crate-memchr \
bundled-rust-crate-pulldown-cmark \
bundled-rust-crate-pulldown-cmark-escape \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-width \
mandown"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
