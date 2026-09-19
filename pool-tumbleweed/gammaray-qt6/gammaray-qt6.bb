SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "GammaRay is a comprehensive collection of high level introspection \
and debugging utilities specifically tailored for the various \
frameworks in Qt."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.0"

RPM_NAME = "gammaray-qt6-3.4.0-1.7.aarch64.rpm"
RPM_HASH = "7e83cf4a466274c950b3f73c3057cd7d7368e6dc6937b96be8ebcbd4d5068b081a6a64169485708deb6d46bb4b3dfe9c7b1e9a9bd40f9f613b4b8be347499321"

RPROVIDES:${PN} += "gammaray-qt6 \
libgammaray-geopositioninfosource.so \
libgammaray-widget-export-actions.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Bluetooth.so.6 \
libQt6Core.so.6 \
libQt6Designer.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Scxml.so.6 \
libQt6StateMachine.so.6 \
libQt6Svg.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgammaray-client.so.3.4.0 \
libgammaray-common-qt6-11-aarch64.so.3.4.0 \
libgammaray-core-qt6-11-aarch64.so.3.4.0 \
libgammaray-kitemmodels-qt6-11-aarch64.so.3.4.0 \
libgammaray-kuserfeedback.so.3.4.0 \
libgammaray-launcher-ui.so.3.4.0 \
libgammaray-launcher.so.3.4.0 \
libgammaray-qt6-3-4-0 \
libgammaray-ui-qt6-11-aarch64.so.3.4.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
