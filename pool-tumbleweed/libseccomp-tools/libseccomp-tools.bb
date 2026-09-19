SUMMARY = "Utilities for the seccomp API"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. \
 \
This subpackage contains debug utilities for the seccomp interface."
LICENSE = "LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libseccomp-tools-2.6.1-3.1.aarch64.rpm"
RPM_HASH = "64e613c3158d4146aebff75561cfb87b828d2f81696504bac8aa55431e346c37cdbc2f48418b7848e4b459405b277b2d4e80351b3c7c29294001ff672ae9cf6b"

RPROVIDES:${PN} += "libseccomp-tools"

RDEPENDS:${PN} += "libc.so.6 \
libseccomp.so.2"

inherit rpm
