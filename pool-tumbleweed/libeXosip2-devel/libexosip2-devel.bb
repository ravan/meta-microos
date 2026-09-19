SUMMARY = "Extended osip2 library"
DESCRIPTION = "Extended library for the osip2 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libeXosip2-devel-5.3.0-1.14.aarch64.rpm"
RPM_HASH = "0159855a0af0dd62167c3ac19a6d93fa095882022487f2b113144bc4f3f1d006574092ce6b226f83e265da0a4a9795e75fde92a5048a7da43b447af3ac286fd1"

RPROVIDES:${PN} += "libeXosip2-15-devel \
libeXosip2-devel"

RDEPENDS:${PN} += "glibc-devel \
libeXosip2-15 \
libosip2-devel \
openssl-devel"

inherit rpm
