SUMMARY = "Non-local goto (setjmp/longmap) implementation based on libunwind"
DESCRIPTION = "The unwind-setjmp library offers a libunwind-based implementation of \
non-local gotos. This is a drop-in replacement for the normal, \
system-provided routines of the same name. With this library, setting \
up a non-local goto via setjmp is generally faster compared to the \
system routines, at the cost of a much slower longjmp."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "libunwind-setjmp0-1.8.3-3.3.aarch64.rpm"
RPM_HASH = "5e0f52ef6755cce81db51be035e428b1009bf6a2b9709a7f14fe1f3e1095bd52c3144fe1570a09e572cb5c96a29b9347c628d3a535eca5c079538af31a427db0"

RPROVIDES:${PN} += "libunwind-setjmp.so.0 \
libunwind-setjmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libunwind-aarch64.so.8"

inherit rpm
