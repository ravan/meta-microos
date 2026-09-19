SUMMARY = "D-Bus service to configure printing via system-config-printer"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This packages provides a D-Bus service to configure printers and manage \
print jobs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-dbus-service-1.5.18-9.6.noarch.rpm"
RPM_HASH = "fbe6b23dcd9ac99a1054368add2fe129badfe022d42d177821379c3d30df56bbabb5b3068646a90256e07f7e95d8aa07bd6b9a11cb281ee4b420cc58fd92edf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "system-config-printer-dbus-service"

RDEPENDS:${PN} += "/usr/bin/sh \
system-config-printer-common"

inherit rpm
