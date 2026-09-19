SUMMARY = "A printer administration tool"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-1.5.18-9.6.aarch64.rpm"
RPM_HASH = "82389ba47cbe1c3d5e2f785e69a2e0c8f96a83b725195e0ac3fa6b8fd886e90065417093d4ed493804fbd5b4a0f808fdd585ed606f68f2ed4f6e3dad210dbd05"

RPROVIDES:${PN} += "system-config-printer"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-cups \
python3-pycurl \
system-config-printer-common"

inherit rpm
