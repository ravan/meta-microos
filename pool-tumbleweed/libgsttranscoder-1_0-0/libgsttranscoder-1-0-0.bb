SUMMARY = "GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the implementation of the GStreamer API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgsttranscoder-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "e7f79d5f5a6675c42a88b242884b9b27a990c5ceedf690e943384d826462634371d6a4ee1132cefcbbf07bf820c1639d1dd7616e38358141d6d68a37a632224d"

RPROVIDES:${PN} += "libgsttranscoder-1-0-0 \
libgsttranscoder-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
