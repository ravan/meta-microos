SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the 64kb flavor of the kernel. \
 \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-64kb-devel-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "e8b883109bc6057415ead564442a12dcf173d42af51d7e56a09956f3b1ce6a08968debdac7c630089677cc2801354aa5dd1422643496554faef1fd6141133231"

RPROVIDES:${PN} += "kernel-64kb-devel \
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
