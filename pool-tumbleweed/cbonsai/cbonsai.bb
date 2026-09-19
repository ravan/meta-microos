SUMMARY = "A bonsai tree generator for your terminal"
DESCRIPTION = "A beautifully random bonsai tree generator. It intelligently \
creates, colors, and positions a bonsai tree, and is entirely \
configurable via CLI options."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "cbonsai-1.4.2-1.5.aarch64.rpm"
RPM_HASH = "901e36b78cab228512e2078c6f8aacf425e0fae13dbed7bcd54b98898ba46f812c54a70caa858d0aac76ede6c6f613412c6a987337dedfa54bd58158276e718f"

RPROVIDES:${PN} += "cbonsai"

RDEPENDS:${PN} += "libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
