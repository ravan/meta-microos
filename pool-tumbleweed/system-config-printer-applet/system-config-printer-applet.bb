SUMMARY = "Notification icon for printing via system-config-printer"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This package provides a notification icon to configure new printers and \
monitor print jobs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-applet-1.5.18-9.6.noarch.rpm"
RPM_HASH = "6059b54274951fbc56138ea33ac725cae10035d1260c5d2c1eb1595e2f1fdf7bfa1b1e196a3f52020d248154b6c4a2645e0af6793b6af4158cbf25734d7ecc0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-com.redhat.NewPrinterNotification \
system-config-printer-applet"

RDEPENDS:${PN} += "/usr/bin/sh \
system-config-printer \
system-config-printer-dbus-service"

inherit rpm
