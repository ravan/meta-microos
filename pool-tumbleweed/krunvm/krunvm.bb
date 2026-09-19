SUMMARY = "Manage lightweight VMs created from OCI images"
DESCRIPTION = "Manage lightweight VMs created from OCI images"
LICENSE = "Apache-2.0"

PV = "0.2.6+git59f3673"

RPM_NAME = "krunvm-0.2.6+git59f3673-1.4.aarch64.rpm"
RPM_HASH = "830d64a07c0cc3f31956cba6f5d50e3f0bc54e2f6ee760c2a801d56710714ac3df02a195ed4f8463f114e7ee44785e5d8cc7b286adb565ab78b5e47d12a3d1c2"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-confy \
bundled-rust-crate-directories \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-heck \
bundled-rust-crate-krunvm \
bundled-rust-crate-libc \
bundled-rust-crate-memoffset \
bundled-rust-crate-nix \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-text-io \
bundled-rust-crate-toml \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-utf8parse \
krunvm"

RDEPENDS:${PN} += "buildah \
libc.so.6 \
libgcc-s.so.1 \
libkrun.so.1 \
libkrun1"

inherit rpm
