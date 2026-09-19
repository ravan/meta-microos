SUMMARY = "Script that shows messages to the user when the battery is almost empty"
DESCRIPTION = "A script that shows messages to the user when the battery is almost empty. \
Put something like this into your i3/sway config: \
exec --no-startup-id i3-battery-popup -n -i /usr/share/icons/breeze/status/32/battery-caution.svg -s /usr/share/i3-battery-popup/i3-battery-popup.wav"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "i3-battery-popup-1.1.1-1.3.noarch.rpm"
RPM_HASH = "023e1af9240136c1dffe0ee4bf29fd01ef8048fe24d7376266fa32f6a4e0fb1052cad252ac2188bfab52dcd036fc40716101c6606fd9764bddfa339c7e31da90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "i3-battery-popup"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
