SUMMARY = "An ASCII Art Library"
DESCRIPTION = "AA-lib is a low level gfx library. AA-lib does not require a graphics \
device. In fact, there is no graphical output possible. AA-lib replaces \
old-fashioned output methods with a powerful ASCII art renderer."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "aalib-1.4.0-518.5.aarch64.rpm"
RPM_HASH = "d243d81b043a5e354b1358993ee86b5d65bacd62b30d6241374df5e1e5cbb206a7f3a1bd49316675acb64405ae1e5fe57510b972a839b6a75d015aa55dab996c"

RPROVIDES:${PN} += "aalib"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaa.so.1 \
libc.so.6"

inherit rpm
