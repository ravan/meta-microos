SUMMARY = "Displays count of running libvirt VMs"
DESCRIPTION = "Displays count of running libvirt VMs."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-libvirt-2.1.5-4.7.noarch.rpm"
RPM_HASH = "feb350daa560582a5f2120b3f5775d95757e9623bed859095e4aa4107b97909c51f52a62d71fa1f646a2f7a85d254e5d65a18ca565329ca1f358fae5a17777c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-libvirt"

RDEPENDS:${PN} += "bumblebee-status \
python3-libvirt-python \
virt-manager"

inherit rpm
