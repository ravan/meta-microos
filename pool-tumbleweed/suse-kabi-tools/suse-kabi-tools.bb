SUMMARY = "A set of ABI tools for the Linux kernel"
DESCRIPTION = "suse-kabi-tools is a set of Application Binary Interface (ABI) tools for the \
Linux kernel."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0+git0.3857c3a"

RPM_NAME = "suse-kabi-tools-1.1.0+git0.3857c3a-1.6.aarch64.rpm"
RPM_HASH = "e0089f1ea58e68e4d5535eae26e65732f48b46a78b7964f40960609febc2260aedef44be5ff1d08192a260abf2402b73ee2987c93f6b86500d5f72c5e5e37628"

RPROVIDES:${PN} += "bundled-rust-crate-suse-kabi-tools \
suse-kabi-tools"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
