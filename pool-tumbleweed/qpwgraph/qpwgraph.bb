SUMMARY = "PipeWire Graph Qt GUI Interface"
DESCRIPTION = "qpwgraph is a graph manager dedicated for PipeWire, using the \
Qt C++ framework, based and pretty much like the same of QjackCtl."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.9"

RPM_NAME = "qpwgraph-0.9.9-1.5.aarch64.rpm"
RPM_HASH = "fc753b0a80c14050634dd824e60042c55a7b8981b5f0b78c45eb61405cc1f5d3d7f8211a4a342aad7006c00e2e09486069962c20a8c1a1da42bab4756579751d"

RPROVIDES:${PN} += "qpwgraph"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpipewire-0.3.so.0 \
libstdc++.so.6"

inherit rpm
