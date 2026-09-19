SUMMARY = "Graphical class browser for Xt"
DESCRIPTION = "viewres displays a tree showing the widget class hierarchy of the \
Athena Widget Set (libXaw)."
LICENSE = "X11"

PV = "1.0.8"

RPM_NAME = "viewres-1.0.8-1.5.aarch64.rpm"
RPM_HASH = "6e6eedf8d358e1f1a16a4b293b305fa0dc4fe0c8720c0a1aa929838cc93689f782cd6020e877e03847f5704da4465dd910ba8721f9bb6c96863cd33aa145bf0f"

RPROVIDES:${PN} += "viewres"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
