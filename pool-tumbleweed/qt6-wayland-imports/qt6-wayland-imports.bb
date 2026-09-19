SUMMARY = "Qt 6 Wayland QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Wayland module"
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-wayland-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7acfb50792e95853ea68595dfbec2eea5eaf5823c0050fcad08376894249cc333e514f60b124464f71b44f39a67a2ffdc0624a8cca23540f8296d287f112caee"

RPROVIDES:${PN} += "libqwaylandcompositorplugin.so \
libwaylandcompositoriviapplicationplugin.so \
libwaylandcompositorpresentationtimeplugin.so \
libwaylandcompositorqtshellplugin.so \
libwaylandcompositorwlshellplugin.so \
libwaylandcompositorxdgshellplugin.so \
libwaylandtexturesharingextensionplugin.so \
libwaylandtexturesharingplugin.so \
qt6-wayland-imports \
qt6qmlimport-QtWayland.Client.TextureSharing \
qt6qmlimport-QtWayland.Client.TextureSharing.1 \
qt6qmlimport-QtWayland.Client.TextureSharing.254 \
qt6qmlimport-QtWayland.Compositor \
qt6qmlimport-QtWayland.Compositor.1 \
qt6qmlimport-QtWayland.Compositor.2 \
qt6qmlimport-QtWayland.Compositor.6 \
qt6qmlimport-QtWayland.Compositor.IviApplication \
qt6qmlimport-QtWayland.Compositor.IviApplication.1 \
qt6qmlimport-QtWayland.Compositor.IviApplication.6 \
qt6qmlimport-QtWayland.Compositor.PresentationTime \
qt6qmlimport-QtWayland.Compositor.PresentationTime.1 \
qt6qmlimport-QtWayland.Compositor.PresentationTime.6 \
qt6qmlimport-QtWayland.Compositor.QtShell \
qt6qmlimport-QtWayland.Compositor.QtShell.1 \
qt6qmlimport-QtWayland.Compositor.QtShell.2 \
qt6qmlimport-QtWayland.Compositor.QtShell.6 \
qt6qmlimport-QtWayland.Compositor.TextureSharingExtension \
qt6qmlimport-QtWayland.Compositor.TextureSharingExtension.1 \
qt6qmlimport-QtWayland.Compositor.TextureSharingExtension.254 \
qt6qmlimport-QtWayland.Compositor.WlShell \
qt6qmlimport-QtWayland.Compositor.WlShell.1 \
qt6qmlimport-QtWayland.Compositor.WlShell.6 \
qt6qmlimport-QtWayland.Compositor.XdgShell \
qt6qmlimport-QtWayland.Compositor.XdgShell.1 \
qt6qmlimport-QtWayland.Compositor.XdgShell.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WaylandClient.so.6 \
libQt6WaylandCompositor.so.6 \
libQt6WaylandCompositorIviapplication.so.6 \
libQt6WaylandCompositorPresentationTime.so.6 \
libQt6WaylandCompositorWLShell.so.6 \
libQt6WaylandCompositorXdgShell.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
qt6qmlimport-QtQuick"

inherit rpm
