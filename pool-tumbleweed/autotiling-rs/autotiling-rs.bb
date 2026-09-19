SUMMARY = "Container layout switcher for sway/i3 with automatic tiling"
DESCRIPTION = "When used on sway (and possibly i3), this automatically \
alternates the container layout between horizontal and vertical \
for successive new containers. \
 \
Simply run the program autotiling-rs. To start it automatically, \
put it in your sway config like this: exec autotiling-rs."
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "autotiling-rs-0.1.8-1.6.aarch64.rpm"
RPM_HASH = "747fc23927ed2e8374f9f6bccff2a9e0ac335a89c6cadc26e411194da426f9a27f0cdc11427952e2a740ca2cdb1a517d623ddc317539e430cc13cefcf27a161a"

RPROVIDES:${PN} += "autotiling-rs \
bundled-rust-crate-anstyle \
bundled-rust-crate-autotiling-rs \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-heck \
bundled-rust-crate-itoa \
bundled-rust-crate-memchr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-strsim \
bundled-rust-crate-swayipc \
bundled-rust-crate-swayipc-types \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-zmij"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
