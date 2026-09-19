SUMMARY = "Lightweight X11 desktop panel based on fbpanel"
DESCRIPTION = "LXPanel is a lightweight X11 desktop panel containing: \
1. User-friendly application menu automatically generated from *.desktop files on the system \
2. Launcher bar (Small icons clicked to launch apps) \
3. Task bar supporting urgency hint (Can flash when gaim gets new incoming messages) \
4. Notification area (System tray) \
5. Digital clock \
6. Run dialog (A dialog lets you type a command and run it, can be called in external programs) \
7. Net status icon plug-in (optional, ported from gnome-netstatus-applet) \
8. Volume control plug-in (optional, written by jserv) \
9. lxpanelctl, an external controller lets you control lxpanel in other programs. \
For example, 'lxpanelctl run' will show the Run dialog in lxpanel, and 'lxpanelctl menu' \
will show the application menu. This is useful in key bindings provided by window managers."
LICENSE = "GPL-2.0-only"

PV = "0.11.1"

RPM_NAME = "lxpanel-0.11.1-1.4.aarch64.rpm"
RPM_HASH = "2bab1ea9db458683ebc2822917cae7879676a9eb83f64bd819a52a8d758b7b176cdd886dbb6ddaea828295cbf3d36fef407ae277bc71cf6066a6afe3b7c98835"

RPROVIDES:${PN} += "config-lxpanel \
lxpanel \
lxpanel-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfm-gtk3.so.4 \
libfm.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libiw.so.30 \
libkeybinder-3.0.so.0 \
liblxpanel.so.0 \
libm.so.6 \
libmenu-cache.so.3 \
libwnck-3.so.0 \
libxml2.so.16 \
lxmenu-data \
menu-cache"

inherit rpm
