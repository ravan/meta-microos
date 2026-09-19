SUMMARY = "GStreamer Transcoding API"
DESCRIPTION = "GStreamer Transcoding cli tool and API"
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-transcoder-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "8d6f87b05070b1237058a9ce3ccc858895b4051f2f0b5d5db151752fc81b5a9f6ed8f36d8c22ac506e4073490ed38a26c51074f68be5d7c57f2267e778f0fc79"

RPROVIDES:${PN} += "gstreamer-transcoder \
gstreamer1 \
libgsttranscode.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttranscoder-1.0.so.0"

inherit rpm
