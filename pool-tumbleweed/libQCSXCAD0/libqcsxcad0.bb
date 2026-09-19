SUMMARY = "Qt-GUI for CSXCAD library"
DESCRIPTION = "A Qt-GUI for the CSXCAD library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "libQCSXCAD0-0.6.3-4.1.aarch64.rpm"
RPM_HASH = "176592da4cdea84a153bf7ea57255a8873a5a0f5a3320d9b4ae9e5d3a513aede3b09365e1ebc851d6f5460724bca111e9718aeb861b9f1ba3d3ec8d545c3c8a5"

RPROVIDES:${PN} += "libQCSXCAD.so.0 \
libQCSXCAD0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCSXCAD.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinyxml.so.0 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonTransforms.so.1 \
libvtkFiltersCore.so.1 \
libvtkFiltersGeneral.so.1 \
libvtkFiltersGeometry.so.1 \
libvtkFiltersModeling.so.1 \
libvtkFiltersSources.so.1 \
libvtkGUISupportQt.so.1 \
libvtkIOGeometry.so.1 \
libvtkIOImage.so.1 \
libvtkIOPLY.so.1 \
libvtkIOXML.so.1 \
libvtkInteractionStyle.so.1 \
libvtkInteractionWidgets.so.1 \
libvtkRenderingAnnotation.so.1 \
libvtkRenderingCore.so.1 \
libvtkRenderingFreeType.so.1 \
libvtkRenderingLOD.so.1 \
libvtkRenderingOpenGL2.so.1 \
libvtksys.so.1"

inherit rpm
