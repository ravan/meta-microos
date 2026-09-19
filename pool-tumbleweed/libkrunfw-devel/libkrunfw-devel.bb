SUMMARY = "Header files and libraries for libkrunfw development"
DESCRIPTION = " \
libkrunfw is a library bundling a Linux kernel in a dynamic library \
in a way that can be easily consumed by libkrun. \
By having the kernel bundled in a dynamic library, libkrun can leave to \
the linker the work of mapping the sections into the process, and then \
directly inject those mappings into the guest without any kind of additional \
work nor processing. \
 \
This package contains the libraries needed to develop programs \
that consume the guest payload integrated in libkrunfw."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "5.5.0"

RPM_NAME = "libkrunfw-devel-5.5.0-2.1.aarch64.rpm"
RPM_HASH = "a0e5194c9a07b47a2e51385af652970e129703ca549435d2784d61e56c6a787738804eaa0e823b2a8a11c56a3cdfec3cb53f10e9008c9a84c3989c0560c27dad"

RPROVIDES:${PN} += "libkrunfw-/usr/lib64/libkrunfw.so \
libkrunfw-devel"

RDEPENDS:${PN} += "libkrunfw5"

inherit rpm
