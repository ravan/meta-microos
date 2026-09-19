SUMMARY = "Cockpit user interface for virtual machines"
DESCRIPTION = "Cockpit component for managing virtual machines. \
 \
If 'virt-install' is installed, you can also create new virtual machines."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "355"

RPM_NAME = "cockpit-machines-355-1.1.noarch.rpm"
RPM_HASH = "94ec2d595b2e99317dae2f8b756d97413d5988ac97550b436b86eb9aef4069361723195a1788b0d9fca7c1ae89cc59b64eb9271cb3bc5815586223b76dcdc248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-machines"

RDEPENDS:${PN} += "cockpit-bridge \
libvirt-client \
libvirt-daemon-qemu \
libvirt-dbus \
qemu-spice \
virt-install"

inherit rpm
