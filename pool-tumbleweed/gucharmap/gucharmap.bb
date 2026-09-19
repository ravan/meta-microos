SUMMARY = "A Featureful Unicode Character Map"
DESCRIPTION = "Gucharmap is a featureful unicode character map."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "17.0.2"

RPM_NAME = "gucharmap-17.0.2-1.4.aarch64.rpm"
RPM_HASH = "09322c8f6ed8a4c245e3b06121a17f801335c5417ffaecff0ddc67b235215ad25083ca44de96e79d73fb7bb92a03476ad0be472726ce7cc76e278d5ec5a1c70e"

RPROVIDES:${PN} += "gucharmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgucharmap-2-90.so.7 \
libpango-1.0.so.0"

inherit rpm
