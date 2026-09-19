SUMMARY = "Really Slick Screensavers Port to GLX"
DESCRIPTION = "Cool collection of 3D screensavers. Linux port of Really Slick Screensavers - \
Web's most visually exciting collection of original, open-source screensavers."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "rss-glx-0.9.1-26.4.aarch64.rpm"
RPM_HASH = "290cf7a3b2b6c80cc058024b67398b19cf9e9199035c21cdd98143247908ccb05c06d4494a41aede8623c548b844f5ed9e47b766fba563cbb934d7619370f34f"

RPROVIDES:${PN} += "config-rss-glx \
libImplicit.so.0 \
libPixelCity.so.0 \
librsMath.so.0 \
rss-glx"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libX11.so.6 \
libalut.so.0 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6"

inherit rpm
