SUMMARY = "Text-based GNU social client"
DESCRIPTION = "GnuSocialShell is a text-based GNU social client written in C."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "gnusocialshell-1.3.0-2.8.aarch64.rpm"
RPM_HASH = "f8241357072bd954cfcb22796da51c5c84f801272a1ad9a781c9c216c132f5aeb232343b95ffaa65d31dbdc34ea1dad30f59ebe6b43fb9925cdb1fe96015719c"

RPROVIDES:${PN} += "gnusocialshell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libreadline.so.8"

inherit rpm
