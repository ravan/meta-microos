SUMMARY = "DLNA compatible server"
DESCRIPTION = "MiniDLNA (aka ReadyDLNA) is server software with the aim of being fully \
compliant with DLNA/UPnP-AV clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "minidlna-1.3.3-3.15.aarch64.rpm"
RPM_HASH = "ca02430021c8455bcbda8fa4414c550ca075a0203f92f675e204998fa5529cf1f9d478c7dec14ef0ef1b1fd301cc2e392a00d042f1a9479488dfcd5557c88330"

RPROVIDES:${PN} += "ReadyMedia \
config-minidlna \
group-minidlna \
minidlna \
user-minidlna"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libexif.so.12 \
libffmpegthumbnailer.so.4 \
libid3tag.so.0 \
libjpeg.so.8 \
libogg.so.0 \
libsqlite3.so.0 \
libvorbis.so.0 \
sysuser-shadow"

inherit rpm
