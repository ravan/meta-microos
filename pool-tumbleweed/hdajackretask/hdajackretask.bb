SUMMARY = "HD-audio jack retasking tool"
DESCRIPTION = "hdajackretask is a GUI tool to make it easy to retask HD-audio jacks."
LICENSE = "GPL-2.0-or-later"

PV = "0.20120413"

RPM_NAME = "hdajackretask-0.20120413-29.4.aarch64.rpm"
RPM_HASH = "e613633c729b484be849e013234efa4ddddb51fdef5bd5e6f35b315cd483bd2b55f22f8107e5a2b2d0349677807b79b3b6a38c64478d45958f61beae68946e35"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/hdajackretask \
hdajackretask"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
