SUMMARY = "Significantly reduce resource consumption by large numbers of SSH connections"
DESCRIPTION = "fdpass-teleport can be optionally used by Machine ID to significantly reduce \
resource consumption in use-cases that create large numbers of SSH connections \
(e.g. Ansible)."
LICENSE = "Apache-2.0"

PV = "17.7.26"

RPM_NAME = "teleport-fdpass-teleport-17.7.26-1.4.aarch64.rpm"
RPM_HASH = "a5fe11fd9e5a7f5f1c9fc2c60c3ab36363e59b8df1a1ac39c9bb466ae8a99c97127ec8a8e46651b099bd3ecc5f258aa232b3e2823b691f2dca6d8f60222dc24a"

RPROVIDES:${PN} += "bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-eyre \
bundled-rust-crate-fdpass-teleport \
bundled-rust-crate-indenter \
bundled-rust-crate-libc \
bundled-rust-crate-memoffset \
bundled-rust-crate-nix \
bundled-rust-crate-once-cell \
bundled-rust-crate-simple-eyre \
teleport-fdpass-teleport"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
