SUMMARY = "Libtool Runtime Library"
DESCRIPTION = "Library needed by programs that use the ltdl interface of GNU libtool."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.2"

RPM_NAME = "libltdl7-2.6.2-1.2.aarch64.rpm"
RPM_HASH = "c148f4e681ca0a5eb61dbac23e76370ffaf8bb15c20494de42ef08044342cdfb2eea34f2edaeff9486e28f516a4da43897246fe318cb849d5bfc814f51c11018"

RPROVIDES:${PN} += "libltdl.so.7 \
libltdl7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
