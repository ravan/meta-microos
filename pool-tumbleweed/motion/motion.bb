SUMMARY = "A motion detection system"
DESCRIPTION = "Motion is a software motion detector. It grabs images from video4linux devices \
and/or from webcams (such as the axis network cameras). Motion is the perfect \
tool for keeping an eye on your property keeping only those images that are \
interesting. Motion is strictly command line driven and can run as a daemon \
with a rather small footprint. This version is built with ffmpeg support but \
without MySQL and PostgreSQL support."
LICENSE = "GPL-2.0-or-later"

PV = "4.7.1"

RPM_NAME = "motion-4.7.1-1.7.aarch64.rpm"
RPM_HASH = "ef1a5d44b36239b4887e600c075d36d7bb6b81adeb1558705a18612c4ec45e1bf4eba1bfae0acd468dfc241be2a1f5fec71e7aa2ff943b3aa77893e31fcbc287"

RPROVIDES:${PN} += "config-motion \
group-motion \
motion \
user-motion"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-video \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavdevice.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libjpeg.so.8 \
libmicrohttpd.so.12 \
libsqlite3.so.0 \
libswscale.so.9 \
libwebp.so.7 \
libwebpmux.so.3 \
shadow \
systemd"

inherit rpm
