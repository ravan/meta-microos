SUMMARY = "Screen Saver and Locker for the X Window System"
DESCRIPTION = "The xlock utility locks your X Window System session and runs a screen \
saver until a password is entered."
LICENSE = "MIT"

PV = "5.84"

RPM_NAME = "xlockmore-5.84-1.6.aarch64.rpm"
RPM_HASH = "764a7b42a8209d286dd2fb1a65ef65480d7ea86d5ac94db6c8e8e2c075832f8251c2bcad889f7439f2341a2116a531a3e30fc63100353011cbc53a65b03900ee"

RPROVIDES:${PN} += "xlockmore"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXpm.so.4 \
libc.so.6 \
libftgl.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libpam.so.0 \
libstdc++.so.6"

inherit rpm
