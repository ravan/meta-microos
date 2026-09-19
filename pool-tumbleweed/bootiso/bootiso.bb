SUMMARY = "A bash script to securely create a bootable USB device from one image file"
DESCRIPTION = "A bash program to securely and easily create a bootable USB device from one image file"
LICENSE = "GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "bootiso-4.2.0-3.10.noarch.rpm"
RPM_HASH = "988563d10fd161f6fb7b7833a3c9c8ec5197021091081d8e8258aef312f1a2c12e68cec54b90f6cb2eea1380eb0890ce3d744d5c9a030c6a881d03ca28ed63a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bootiso"

RDEPENDS:${PN} += "/usr/bin/bash \
bc \
jq \
syslinux \
wimtools"

inherit rpm
