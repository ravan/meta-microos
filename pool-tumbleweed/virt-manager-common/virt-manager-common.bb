SUMMARY = "Common files used by the different Virtual Machine Manager interfaces"
DESCRIPTION = "Common files used by the different virt-manager interfaces, as well as \
virt-install related tools."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "virt-manager-common-5.1.0-16.1.noarch.rpm"
RPM_HASH = "eea1ce91c6adb6fef9cd975d4d7abfed685453eefd1692e702b57b468f7e160a647f299b174323a5f5ed0abc6c064e09c020d1d077ad3211d8caa05780eb9cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-manager-common"

RDEPENDS:${PN} += "libosinfo \
python3-argcomplete \
python3-gobject \
python3-libvirt-python \
python3-requests \
typelib-Libosinfo \
xorriso"

inherit rpm
