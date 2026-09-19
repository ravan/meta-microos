SUMMARY = "Utilities for installing virtual machines"
DESCRIPTION = "Package includes several command line utilities, including virt-install \
(build and install new VMs) and virt-clone (clone an existing virtual \
machine)."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "virt-install-5.1.0-16.1.noarch.rpm"
RPM_HASH = "8506293310506ce6c2afff5a7bef0edd63665c59c6003336064e4cc7ff7dcc321c083b131fcf6306e808a9ed3d59dfd83641ee081f8f56924ff5e777bcd0ee64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtinst \
virt-clone \
virt-install \
virt-xml"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
libvirt-client \
virt-manager-common"

inherit rpm
