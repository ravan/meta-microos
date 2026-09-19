SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libAnalitza9-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d9e243635b06f7720afba4b25692d8b42214a0fc449fa513d62e421dd072fd00888ae90da1f5f30920dc17cdd7eab68c8140e62d608e4774457d824cd0434480"

RPROVIDES:${PN} += "libAnalitza.so.9 \
libAnalitza9 \
libAnalitzaGui.so.9 \
libAnalitzaPlot.so.9 \
libAnalitzaWidgets.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
analitza \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
