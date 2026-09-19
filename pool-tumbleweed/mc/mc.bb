SUMMARY = "Midnight Commander"
DESCRIPTION = "GNU Midnight Commander (also referred to as MC) is a user shell much \
like the (in)famous Norton Commander with text-mode full-screen \
interface. It can be run on the OS console, in xterm and other \
terminal emulators. \
 \
GNU Midnight Commander allows you to manage files while making most of \
your screen and giving you a clear representation of the filesystem, yet \
it's simple enough to be run over a telnet or ssh session. \
 \
MC needs several other programs for its various extfs extensions, e.g. \
isoinfo (from mkisofs) or xorriso for the iso:// extension."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.33"

RPM_NAME = "mc-4.8.33-2.6.aarch64.rpm"
RPM_HASH = "84d25a5429b12e5bc7bf48846ccd3b2817baa1eb220a8da724a91d0cc377ee9741fd3e5c0a751a3ea08788d7c44008af07ab74087f4983df4268031c62da0a2b"

RPROVIDES:${PN} += "config-mc \
mc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libe2p.so.2 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgpm.so.2 \
libslang.so.2 \
libssh2.so.1 \
permissions"

inherit rpm
