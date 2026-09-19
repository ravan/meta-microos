SUMMARY = "The 'gstreamer' libextractor plugin"
DESCRIPTION = "This package ships the 'gstreamer' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-gstreamer-1.14-1.2.aarch64.rpm"
RPM_HASH = "39ef726f393f42540f7c36b5471e122bd1f7dea30b414895fed347f8318864afa07372bdaebf022e4a5b8d339e061f4df44ce556c0046d26b30c04aa38abca68"

RPROVIDES:${PN} += "libextractor-gstreamer.so \
libextractor-plugins-gstreamer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0"

inherit rpm
