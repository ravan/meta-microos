SUMMARY = "Reverse Engineering Framework"
DESCRIPTION = "Opensource tools to disassemble, debug, analyze and manipulate binary files."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "6.2.2"

RPM_NAME = "radare2-6.2.2-1.1.aarch64.rpm"
RPM_HASH = "fb4348552711a95eaa109c591aef9172cdb7fa4f5fdd7594d0557ae1099b41dcc0bfb2e0a6e5b8f321ee7ee709e1ae00bd23749ffab57a627de2b987ec6513a3"

RPROVIDES:${PN} += "libr-anal.so.6.2.2 \
libr-arch.so.6.2.2 \
libr-asm.so.6.2.2 \
libr-bin.so.6.2.2 \
libr-bp.so.6.2.2 \
libr-config.so.6.2.2 \
libr-cons.so.6.2.2 \
libr-core.so.6.2.2 \
libr-debug.so.6.2.2 \
libr-egg.so.6.2.2 \
libr-esil.so.6.2.2 \
libr-flag.so.6.2.2 \
libr-fs.so.6.2.2 \
libr-io.so.6.2.2 \
libr-lang.so.6.2.2 \
libr-magic.so.6.2.2 \
libr-main.so.6.2.2 \
libr-muta.so.6.2.2 \
libr-reg.so.6.2.2 \
libr-search.so.6.2.2 \
libr-socket.so.6.2.2 \
libr-syscall.so.6.2.2 \
libr-util.so.6.2.2 \
radare2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcapstone.so.5 \
liblz4.so.1 \
libm.so.6 \
libmagic.so.1 \
libsdb.so.2.5.2 \
libxxhash.so.0 \
libz.so.1 \
libzip.so.5"

inherit rpm
