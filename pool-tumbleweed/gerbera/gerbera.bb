SUMMARY = "UPnP Media Server"
DESCRIPTION = "Gerbera is a UPnP media server which allows streaming digital \
media through a network and consume it on a variety of UPnP \
compatible devices."
LICENSE = "GPL-2.0-only"

PV = "3.2.1"

RPM_NAME = "gerbera-3.2.1-2.1.aarch64.rpm"
RPM_HASH = "6cd034e1aedce4f574cb29c9f545520f88744528c37ca8a5524f4eac9c29ecb2f3dab93fabe373faa78a4c04aac273d65d2de602e3f700c5147de8de11d3fd7a"

RPROVIDES:${PN} += "config-gerbera \
gerbera \
group-gerbera \
user-gerbera"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcurl.so.4 \
libduktape.so.207 \
libebml.so.5 \
libexif.so.12 \
libexiv2.so.28 \
libffmpegthumbnailer.so.4 \
libfmt.so.12 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuio.so.78 \
libicuuc.so.78 \
libjsoncpp.so.27 \
libm.so.6 \
libmagic.so.1 \
libmariadb.so.3 \
libmatroska.so.7 \
libnpupnp.so.13 \
libpq.so.5 \
libpqxx-7.10.so \
libpugixml.so.1 \
libspdlog.so.1.17 \
libsqlite3.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libtag.so.2 \
libuuid.so.1 \
libwavpack.so.1 \
logrotate \
systemd \
sysuser-shadow"

inherit rpm
