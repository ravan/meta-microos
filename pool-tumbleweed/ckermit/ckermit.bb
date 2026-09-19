SUMMARY = "A Combined Serial and Network Communication Software Package"
DESCRIPTION = "C-Kermit is a combined serial and network communication software \
package offering a consistent, medium-independent, and cross-platform \
approach to connection establishment, terminal sessions, file transfer, \
character-set translation, and automation of communication tasks."
LICENSE = "BSD-3-Clause"

PV = "9.0.302"

RPM_NAME = "ckermit-9.0.302-20.4.aarch64.rpm"
RPM_HASH = "0ed3cb7fb17228fc41789b504cadc0d40a2d4ba590516db1adcd552f5459085369f0c5439787023b03af85bed8a800e96ef8ce052225a3a4449e8bb7bbc8978c"

RPROVIDES:${PN} += "ckermit \
kermit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
