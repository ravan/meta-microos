SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "install-initrd-openSUSE-17.178-1.9.aarch64.rpm"
RPM_HASH = "c00a9bd6976a92caff4488989d12e77394d3d3b8ddcc046b4e6b7068f76146be370ba8afd57027c428b2a4f1781f7523c32bf22390a0bc77c3cb2b875542f23a"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
