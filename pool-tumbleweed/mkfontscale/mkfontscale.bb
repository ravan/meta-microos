SUMMARY = "Utility to create index of scalable font files for X"
DESCRIPTION = "mkfontscale creates the fonts.scale and fonts.dir index files used by the \
legacy X11 font system."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "mkfontscale-1.2.4-1.3.aarch64.rpm"
RPM_HASH = "d26875a4878f2281661e5877f006dc21bc0216f71527b76f099491ac9889ee0cd64f18bfa317bbfbf84d09a7b60e6f42487a5c0f70a626bc60a018e6c0b7f261"

RPROVIDES:${PN} += "mkfontdir \
mkfontscale"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontenc.so.1 \
libfreetype.so.6 \
libz.so.1"

inherit rpm
