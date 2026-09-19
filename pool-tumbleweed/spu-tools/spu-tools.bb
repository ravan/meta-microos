SUMMARY = "User space tools for Cell/B.E."
DESCRIPTION = "The spu-tools package contains user space tools for Cell/B.E. \
   Currently, it contain two tools: - spu-top: a tool like top to \
   watch the SPU's on a Cell BE System. It shows information about \
   SPUs and running SPU contexts. \
 \
- spu-ps: a tool like ps, which dumps a report on the currently running \
SPU contexts."
LICENSE = "GPL-2.0-only"

PV = "2.3.0"

RPM_NAME = "spu-tools-2.3.0-30.5.aarch64.rpm"
RPM_HASH = "a96b339d55bd0d0aa796e60f8126091eeb3bf44021e1210e149254636ca14dd380c377fc827ef5b8ed00fe4226322e315b80b910566ce40593544babb8e4a484"

RPROVIDES:${PN} += "spu-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
