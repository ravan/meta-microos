SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "install-initrd-MicroOS-17.178-1.9.aarch64.rpm"
RPM_HASH = "40e3983ad482f95b74edec117c11e694a4c26dd6759ca3a52148ed2f69804ae8ffe3d1784787d58444a80a50da966a9c389400514f02a8f8ec89a5443e6690aa"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
