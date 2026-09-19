SUMMARY = "Video4Linux TV application (Motif)"
DESCRIPTION = "motv is a X11 application for watching TV with your Linux box. It supports \
video4linux devices (for example bttv cards, various USB webcams, ...).	It's \
based on xawtv's code, but uses Motif to provide a better GUI. \
 \
Also includes the teletext/videotext viewer mtt."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "motv-3.107-3.9.aarch64.rpm"
RPM_HASH = "bcebfa12718aa362e4c50d0c77b55da3b8d62d05427c016aff631a038d914a1e2cafd84736923134b93302b676e423c782d4fbcd038b56e50badf406d00e340b"

RPROVIDES:${PN} += "motv \
xawtv-/usr/bin/motv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXm.so.4 \
libXmu.so.6 \
libXpm.so.4 \
libXrandr.so.2 \
libXt.so.6 \
libXv.so.1 \
libXxf86dga.so.1 \
libXxf86vm.so.1 \
libasound.so.2 \
libc.so.6 \
libfontconfig.so.1 \
libjpeg.so.8 \
liblirc-client.so.0 \
libm.so.6 \
libzvbi.so.0 \
tv-common \
tv-fonts \
v4l-conf"

inherit rpm
