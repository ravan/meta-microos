SUMMARY = "COSMIC media player"
DESCRIPTION = "COSMIC media player."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-player-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "bd62c853b820cbd7ae93621b8d781db6efc98d6e68b9de23fc0fb1fdba57550b65aefd2cbf761cf18b15690b1762756a94061e7d5895570c8be02afa75abf3eb"

RPROVIDES:${PN} += "cosmic-player"

RDEPENDS:${PN} += "gstreamer-plugins-bad \
gstreamer-plugins-good \
gstreamer-plugins-libav \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
