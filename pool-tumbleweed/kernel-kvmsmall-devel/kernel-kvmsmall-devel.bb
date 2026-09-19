SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the kvmsmall flavor of the kernel. \
 \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-kvmsmall-devel-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "1eff14c8c7e927fd1fb495492fd6b7f513c0a187c2290042f064c3769b36e8f9bfd1dd37a7462f21ee854948a9cc42b69ced2233cc136b5283c35f55515e6ec0"

RPROVIDES:${PN} += "kernel-kvmsmall-devel \
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
