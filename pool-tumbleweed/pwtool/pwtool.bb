SUMMARY = "Password generation tool"
DESCRIPTION = "Generate passwords from random characters or words and optionally show their \
cryptographic hash. \
 \
The default generated password set is copy/paste friendly without extended \
characters that would break the default copy selection you get when \
double-clicking a word. They also are don't break quotation strings (quote \
marks, double quotes or backticks)."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.1"

RPM_NAME = "pwtool-0.6.1-1.8.aarch64.rpm"
RPM_HASH = "d8923ecb9af9ba85ba1cbfb4fd2b1df451d93cacb7c8e944490a1e6a50c6d9906b886f9c14403c4db4b3dd97d7c8e1cbd9d4b049bf1d0fb4267989dd00897c61"

RPROVIDES:${PN} += "bundled-rust-crate-base64 \
bundled-rust-crate-block-buffer \
bundled-rust-crate-blowfish \
bundled-rust-crate-byteorder \
bundled-rust-crate-cfg-if \
bundled-rust-crate-cipher \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crypto-common \
bundled-rust-crate-crypto-mac \
bundled-rust-crate-digest \
bundled-rust-crate-generic-array \
bundled-rust-crate-getopts \
bundled-rust-crate-getrandom \
bundled-rust-crate-hmac \
bundled-rust-crate-libc \
bundled-rust-crate-md-5 \
bundled-rust-crate-md5 \
bundled-rust-crate-opaque-debug \
bundled-rust-crate-pbkdf2 \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-pwhash \
bundled-rust-crate-pwtool \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-sha-1 \
bundled-rust-crate-sha1 \
bundled-rust-crate-sha2 \
bundled-rust-crate-subtle \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-width \
bundled-rust-crate-version-check \
bundled-rust-crate-zerocopy \
pwtool"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
