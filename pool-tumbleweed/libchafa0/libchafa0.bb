SUMMARY = "Shared library for chafa"
DESCRIPTION = "The core of Chafa which converts all kinds of images, including \
animated image formats like GIFs, into ANSI/Unicode characters."
LICENSE = "LGPL-3.0-or-later"

PV = "1.18.2"

RPM_NAME = "libchafa0-1.18.2-1.3.aarch64.rpm"
RPM_HASH = "429dc6301929c038ff60820ffa1eccdf9e6a7261070162ee437c6114233fe0369d2fecd4980e09cc513d15465137a60725bc75d117f35ac75426107d979925bb"

RPROVIDES:${PN} += "libchafa.so.0 \
libchafa0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
