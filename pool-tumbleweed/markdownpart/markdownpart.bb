SUMMARY = "KPart for rendering Markdown content"
DESCRIPTION = "A(nother) Markdown viewer KParts plugin, which allows \
KParts-using applications to display files in \
Markdown format in the rendered target format. \
Examples are Ark, Krusader, Kate's preview plugin & Konqueror."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "markdownpart-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "615804143bd917207337ab14e28f3456c54fd593e03a8f49728d0e02480aa823a330783c39b065fb737e9de516ff063452af42214aa802a3723af2606dbffb5c"

RPROVIDES:${PN} += "markdownpart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6Parts.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
