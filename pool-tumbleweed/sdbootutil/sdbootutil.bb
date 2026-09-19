SUMMARY = "Bootctl wrapper for BLS boot loaders"
DESCRIPTION = "bootctl wrapper for BLS boot loaders, like systemd-boot and grub2-bls. \
Implements also the life cycle of a full disk encryption installation, \
based on systemd."
LICENSE = "MIT"

PV = "1+git20260909.7cfa1f0"

RPM_NAME = "sdbootutil-1+git20260909.7cfa1f0-1.1.aarch64.rpm"
RPM_HASH = "b0af09e4469ba2500e0e613c92ca4199404109269e57d29f37f69c94f62a6c701f3a377c8b7e065896e0ffbb8df433a6f3c6f4cfe6b7acfa5c48ea4b93145743"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-bitflags \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-macros \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-shlex \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-uhmac \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vcpkg \
sdbootutil"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
cryptsetup \
dracut-pcr-signature \
e2fsprogs \
efibootmgr \
jq \
keyutils \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libtss2-tcti-device0 \
openssl \
qrencode \
sdbootutil-dracut-measure-pcr \
sed \
systemd \
tpm2.0-tools \
udev"

inherit rpm
