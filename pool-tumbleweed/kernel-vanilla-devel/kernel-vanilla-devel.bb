SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the vanilla flavor of the kernel. \
 \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-vanilla-devel-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "fa21259273fc62d8e59f6e9691d081b873cbc9389542841f98932fcb4a67029cab3bfd6a77542f6ec7f13bea12a6a967e2f89ac78946a27c0dd70d2843a5519a"

RPROVIDES:${PN} += "kernel-vanilla-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
dwarves \
gcc \
kernel-source-vanilla \
libc.so.6 \
libcrypto.so.3 \
libdw.so.1 \
libelf.so.1 \
libz.so.1 \
zstd"

inherit rpm
