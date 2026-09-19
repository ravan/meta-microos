SUMMARY = "GMailNotify plugin for Vacuum-IM"
DESCRIPTION = "Vacuum-IM plugin for gmail notifications."
LICENSE = "GPL-3.0"

PV = "1.0.5+git1518929179.2d687c8"

RPM_NAME = "vacuum-im-plugins-gmailnotify-1.0.5+git1518929179.2d687c8-1.36.aarch64.rpm"
RPM_HASH = "3cc0ae127915a7a045e7a30d6d58e5a170f94104418f81805a8a2163c19093362b49182e026fee2e5d48bd99789016106a48f4d72b3c3f8268224b0ac4454a3e"

RPROVIDES:${PN} += "libgmailnotify.so \
vacuum-im-plugins-gmailnotify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37"

inherit rpm
