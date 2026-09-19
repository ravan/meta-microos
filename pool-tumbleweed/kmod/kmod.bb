SUMMARY = "Utilities to load modules into the kernel"
DESCRIPTION = "kmod is a set of tools to handle common tasks with Linux kernel \
modules like insert, remove, list, check properties, resolve \
dependencies and aliases. \
 \
These tools are designed on top of libkmod, a library that is shipped \
with kmod. The aim is to be compatible with tools, configurations and \
indexes from module-init-tools project."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "34.2"

RPM_NAME = "kmod-34.2-5.3.aarch64.rpm"
RPM_HASH = "e5d138aeec1f10e7a700e291fd99d794484d15255f2a37c26c578d45a100161ac177d3e59c6c283e929b88407926a3c13fb58f8d8c5d4143ffd30c63ace2ea32"

RPROVIDES:${PN} += "/sbin/modprobe \
kmod \
kmod-bash-completion \
kmod-compat \
kmod-zstd \
module-init-tools \
modutils \
pkgconfig-kmod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1 \
suse-module-tools"

inherit rpm
