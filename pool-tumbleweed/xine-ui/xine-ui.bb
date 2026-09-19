SUMMARY = "Video player with plugins"
DESCRIPTION = "xine is a free multimedia player. It plays back CDs, DVDs, and VCDs. It \
also decodes multimedia files like AVI, MOV, WMV, and MP3 from local \
disk drives, and displays multimedia streamed over the Internet. It \
interprets many of the most common multimedia formats available - and \
some of the most uncommon formats, too. \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "0.99.14"

RPM_NAME = "xine-ui-0.99.14-3.5.aarch64.rpm"
RPM_HASH = "c9cc3393ecf8f550928079c643f7a2d98b37c66116259311b1efae537ab05c768eb26ba5d2bc0d05dcfde9c14e8e582fc8e402942477ab40606a8a2a946e0e18"

RPROVIDES:${PN} += "xine-/usr/bin/xine \
xine-ui"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXss.so.1 \
libXtst.so.6 \
libXv.so.1 \
libXxf86vm.so.1 \
libc.so.6 \
libcurl.so.4 \
libjpeg.so.8 \
liblirc-client.so.0 \
libm.so.6 \
libpng16.so.16 \
libreadline.so.8 \
libxine.so.2"

inherit rpm
