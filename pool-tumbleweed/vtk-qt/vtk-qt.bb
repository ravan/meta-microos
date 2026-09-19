SUMMARY = "Qt libraries for VTK"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This package provides the Qt libraries for VTK."
LICENSE = "BSD-3-Clause"

PV = "9.6.1"

RPM_NAME = "vtk-qt-9.6.1-2.2.aarch64.rpm"
RPM_HASH = "3ddedc65b6ce7980c8473908f29536a4e9341b725a9cecc93f319d7ee8a5448130b1e352c86cc6ed9d85eef6ef06dca020d072eefbb974ddb3e89bdf6bf2e45f"

RPROVIDES:${PN} += "libvtkGUISupportQt.so.1 \
libvtkGUISupportQtQuick.so.1 \
libvtkGUISupportQtSQL.so.1 \
libvtkRenderingQt.so.1 \
libvtkViewsQt.so.1 \
vtk-qt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvtk1 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonSystem.so.1 \
libvtkFiltersCore.so.1 \
libvtkFiltersExtraction.so.1 \
libvtkFiltersSources.so.1 \
libvtkFiltersTexture.so.1 \
libvtkIOSQL.so.1 \
libvtkInfovisCore.so.1 \
libvtkInteractionStyle.so.1 \
libvtkInteractionWidgets.so.1 \
libvtkRenderingCore.so.1 \
libvtkRenderingLabel.so.1 \
libvtkRenderingOpenGL2.so.1 \
libvtkViewsCore.so.1 \
libvtkViewsInfovis.so.1 \
libvtkfmt.so.1 \
libvtksys.so.1"

inherit rpm
