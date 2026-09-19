SUMMARY = "Command-line client to control cdemu-daemon"
DESCRIPTION = "cdemu-client is a command-line client for controlling cdemu-daemon. \
 \
It provides a way to perform the key tasks related to controlling the \
CDEmu daemon, such as loading and unloading devices, displaying \
devices' status and retrieving/setting their debug masks."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.1"

RPM_NAME = "cdemu-client-3.3.1-1.2.noarch.rpm"
RPM_HASH = "584c9c782fdbd34871fffea20f61af06c8a855167f29314d8b4f32cdf1c528a0d4ea9641cbf660e2751220f1eb7cda03efb7b9ce2d6ce51962c1e252b4278290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cdemu-client"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
python3-dbus-python \
python3-gobject \
typelib-GLib \
typelib-Gio"

inherit rpm
