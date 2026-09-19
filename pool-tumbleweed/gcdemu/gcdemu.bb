SUMMARY = "GTK+ application for controlling CDEmu daemon"
DESCRIPTION = "It provides a graphic interface that allows performing the key \
tasks related to controlling the CDEmu daemon, such as loading and \
unloading devices, displaying devices' status and \
retrieving/setting devices' debug masks. \
 \
In addition, the application listens to signals emitted by \
CDEmu daemon and provides notifications via libnotify (provided \
that python bindings are installed). \
 \
Features: \
 * GTK+ application. \
 * Supports communication via either session or system bus. \
 * Device status display, device loading and unloading. \
 * Support for getting/setting device's debug masks. \
 * Daemon and device status changes notification via libnotify."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.1"

RPM_NAME = "gcdemu-3.3.1-1.3.noarch.rpm"
RPM_HASH = "33b967ce4d7ef77596adddd2ac7e49746f56344711a52ba4bd54093a10eadce43ee3b00e5ab85a35ed224db1163bc77edaeaa63bd2d919be3373badfb3d38e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcdemu"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
cdemu-daemon \
python3-gobject-Gdk \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Notify"

inherit rpm
