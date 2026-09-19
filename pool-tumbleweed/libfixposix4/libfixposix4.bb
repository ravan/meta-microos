SUMMARY = "Shared library for libfixposix"
DESCRIPTION = "Thin wrapper over POSIX syscalls. \
The purpose of libfixposix is to offer replacements for parts of POSIX \
whose behaviour is inconsistent across *NIX flavours. \
 \
This package contains the shared library."
LICENSE = "BSL-1.0"

PV = "0.5.1"

RPM_NAME = "libfixposix4-0.5.1-1.11.aarch64.rpm"
RPM_HASH = "4b719cd51ea86da5bdbd5925d71c8b89bd910704fc47a0853c397f5748f6008db362bc3cabe2656e361735f0bb83e8b828e86d279e29456de4cc16ae76d92caa"

RPROVIDES:${PN} += "libfixposix.so.4 \
libfixposix4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
