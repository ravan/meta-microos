SUMMARY = "Library for rendering web content, WPE port"
DESCRIPTION = "WPE allows embedders to create simple and performant systems based on \
Web platform technologies. It is designed with hardware acceleration \
in mind, leveraging common 3D graphics APIs for best performance."
LICENSE = "BSD-3-Clause & LGPL-2.1-only"

PV = "2.52.6"

RPM_NAME = "libWPEWebKit-2_0-1-2.52.6-1.1.aarch64.rpm"
RPM_HASH = "c6a5eecb7603a4d2a9a754f870db0510d1d0a4655692cfdcf90c9132b7ee2b41cb8a38c54744ada066a4ad24eb9604b680b8bd4a7fc53dcfee99446148aae87a"

RPROVIDES:${PN} += "libWPEWebKit-2-0-1 \
libWPEWebKit-2.0.so.1 \
libWPEWebKit-{-apiver}"

RDEPENDS:${PN} += "/sbin/ldconfig \
bubblewrap \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libatomic.so.1 \
libavif.so.16 \
libbacktrace.so.0 \
libc.so.6 \
libdrm.so.2 \
libepoxy.so.0 \
libexpat.so.1 \
libflite-cmu-us-awb.so.1 \
libflite-cmu-us-kal.so.1 \
libflite-cmu-us-rms.so.1 \
libflite-cmu-us-slt.so.1 \
libflite-cmulex.so.1 \
libflite-usenglish.so.1 \
libflite.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstfft-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libharfbuzz-icu.so.0 \
libharfbuzz.so.0 \
libhyphen.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libjpeg.so.8 \
libjxl.so.0.11 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libseccomp.so.2 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libtasn1.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libwpe-1.0.so.1 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1 \
wpewebkit-2-0-injected-bundles \
xdg-dbus-proxy"

inherit rpm
