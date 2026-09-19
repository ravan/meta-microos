SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the longterm flavor of the kernel. \
 \
 \
Source Timestamp: 2026-09-12 22:20:24 +0000 \
GIT Revision: 5fd8dd86aa6ed38923322b5ebd90adc85e8e7c55 \
GIT Branch: slowroll"
LICENSE = "GPL-2.0-only"

PV = "6.18.51"

RPM_NAME = "kernel-longterm-devel-6.18.51-1.1.aarch64.rpm"
RPM_HASH = "bb8a62448b0f7ccec683e14c08d9d49c6f7faf23deec9e348800b3ec9aaa14fc4a40367edd5b62440bd81b4cecc8173309fab6f0bebe073e1862abd837970355"

RPROVIDES:${PN} += "kernel-longterm-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
dwarves \
gcc \
kernel-devel-longterm \
libc.so.6 \
libcrypto.so.3 \
libdw.so.1 \
libelf-devel \
libelf.so.1 \
libz.so.1 \
pesign-obs-integration \
zstd"

inherit rpm
