SUMMARY = "An x86 emulation library"
DESCRIPTION = "An x86 emulation library with focus on usage and \
execution logging functions."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "libx86emu3-3.7-1.6.aarch64.rpm"
RPM_HASH = "2f70ed3a90e2a6a132af6a16c6156fe75608c0ab08ef7d2b2d4a0feaa4bb9ad9855e59c5ec1babf8889229ee74a03fafe08a20239372989d250b96df92f72149"

RPROVIDES:${PN} += "libx86emu.so.3 \
libx86emu3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
