SUMMARY = "Udev rules for accessing Logitech Unifying Receiver"
DESCRIPTION = "Rules that users are able to access Logitech Unifying Receiver."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.20"

RPM_NAME = "solaar-udev-1.1.20-1.1.noarch.rpm"
RPM_HASH = "bfb3fb2c9941f8b1d835919bb04b37a357627816ba03e358443ebff03f9eea90913b03346ab844cd9e1db77f28f7d80b5692595dc8467abc4313b5e0395523dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solaar-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
udev"

inherit rpm
