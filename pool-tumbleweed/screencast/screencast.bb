SUMMARY = "A screencasting application"
DESCRIPTION = "A screencasting application for the Pantheon Desktop. \
 \
Current features: \
  * encoding to WebM \
  * selection of the area to be recorded \
  * display of the pressed keys \
  * audio recording"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "screencast-1.0.0-3.8.aarch64.rpm"
RPM_HASH = "2b92b601fbfd297c4eb8e2edd85a0cdbd5fe28de945f2443c4be46e3ef53a13b249162cd9c3edece7b1803f07c522d7e7a5e19aea61afad3f6f2f90743511644"

RPROVIDES:${PN} += "eidete \
screencast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libappindicator3.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
