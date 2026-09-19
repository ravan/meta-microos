SUMMARY = "Script to setup virtual bridges"
DESCRIPTION = "virt-bridge-setup is a script to automate the setup of virtual bridges using NetworkManager and dbus. \
It simplifies the process of creating and managing network bridges for virtualization environments."
LICENSE = "GPL-2.0-or-later"

PV = "2.9"

RPM_NAME = "virt-bridge-setup-2.9-2.3.noarch.rpm"
RPM_HASH = "0ad1a1b2aed1327eeb07181cef41f8129b0fe73531dda2a0ab399e74b56b5f6ca543add1ed9d41923502be0d93d987061f35efb0298feaeeb72508483d80b795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-bridge-setup"

RDEPENDS:${PN} += "/usr/bin/env \
NetworkManager \
python3-dbus-python"

inherit rpm
