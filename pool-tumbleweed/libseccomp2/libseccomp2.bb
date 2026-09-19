SUMMARY = "An enhanced Seccomp (mode 2) helper library"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. The libseccomp API abstracts \
away the underlying BPF-based syscall filter language and presents a \
more conventional function-call based filtering interface."
LICENSE = "LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libseccomp2-2.6.1-3.1.aarch64.rpm"
RPM_HASH = "d79c4254138654eeb268f83006e79af984c8ef7cd16c4e292ed14bfcf211adae6a89929a1f0148b41bf11fd006f388de224ba22625c76d4bf65dc5e63a27aa6c"

RPROVIDES:${PN} += "libseccomp.so.2 \
libseccomp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
