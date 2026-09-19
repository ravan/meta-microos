SUMMARY = "Linux headers for userspace development"
DESCRIPTION = "This package provides Linux kernel headers, the kernel API description \
required for compilation of almost all programs. This is the userspace \
interface; compiling external kernel modules requires \
kernel-(flavor)-devel, or kernel-syms to pull in all kernel-*-devel, \
packages, instead."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "linux-glibc-devel-7.2-2.1.aarch64.rpm"
RPM_HASH = "c3b68f14961830f850cd474eba1a22791eb5ca8cf8e370db4f76e67c3846826af1fed37acea0fd26e7b63a58c02b5b117ce156d5729b28d2480aba4df32296a4"

RPROVIDES:${PN} += "kernel-headers \
linux-glibc-devel \
linux-kernel-headers"

RDEPENDS:${PN} += "coreutils"

inherit rpm
