SUMMARY = "Dock applet for the MATE panel"
DESCRIPTION = "An application dock applet for the MATE panel. \
 \
The applet allows you to: \
 * Place a dock on any MATE panel, of any size, on any side of the \
   desktop you desire. \
 * Pin and unpin applications to the dock. \
 * Rearrange application icons on the dock. \
 * Launch applications by clicking on their icons in the dock. \
 * Minimise/restore the running application windows by clicking the \
   applications dock icon. \
 * Detect changes in the current icon theme and update the dock \
   accordingly. \
 * Use an indicator by each application to show when it is running. \
 * Optionally, use multiple indicators for each window an \
   application has opened. \
 * Use either a light or dark indicator that it can always be seen \
   no matter what colour the panel is."
LICENSE = "GPL-2.0-or-later"

PV = "21.10.0"

RPM_NAME = "mate-applet-dock-21.10.0-2.2.aarch64.rpm"
RPM_HASH = "7980d85175d8aae24c799bc3639ee38e3c64cba7b2b1587128ceaee83916eb3e2bb7944492ef13de5b722dd5676793bf2b19cb68e1f3d2e01d3a82f81e58ca23"

RPROVIDES:${PN} += "mate-applet-dock"

RDEPENDS:${PN} += "/usr/bin/python3 \
bamf-daemon \
python3-Pillow \
python3-cairo \
python3-distro \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-python-xlib \
python3-pyxdg \
typelib-Bamf \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-MatePanelApplet \
typelib-Notify \
typelib-Pango \
typelib-Wnck"

inherit rpm
