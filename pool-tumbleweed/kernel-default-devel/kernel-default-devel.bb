SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the default flavor of the kernel. \
 \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-default-devel-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "49d5bf1882d5666b661dbfe57275216ee969925ba532379b6d0115544a45925e735216e85d74ebc67f24bcf1b7f0ab2fd49961492b9cac0ed7511d646b2cf34d"

RPROVIDES:${PN} += "kernel-default-devel \
kernel-preempt-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
dwarves \
gcc \
kernel-devel \
libc.so.6 \
libcrypto.so.3 \
libdw.so.1 \
libelf-devel \
libelf.so.1 \
libz.so.1 \
pesign-obs-integration \
zstd"

inherit rpm
