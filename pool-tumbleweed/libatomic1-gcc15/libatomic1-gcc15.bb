SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "15.3.0+git11272"

RPM_NAME = "libatomic1-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "b5f6e8f74855ecba48198167bc51cf9dad2d23a2053bb74a926ded252df3e09c84486c1c277d7aa0afb86547e886ef0c969cc65600530337c0b053e0dd9ef788"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1 \
libatomic1-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
