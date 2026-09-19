SUMMARY = "HC GTK+ 2 Theme Engine"
DESCRIPTION = "The High Contrast engine is targeted for usability themes, such as the \
GNOME HighContrast theme."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-hcengine-2.20.2-23.6.aarch64.rpm"
RPM_HASH = "f6b9e5882d7e5ae977f37a03291cec94f91eedf228d96351dd96eb7322af60c4c5442a1804be6f2438bf543a4f359f8e416a87462e3326e4ed1a2cc45131d3a0"

RPROVIDES:${PN} += "gtk2-engine-hcengine \
libhcengine.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
