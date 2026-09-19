SUMMARY = "Configure Hypervisor and Tools for Xen and KVM"
DESCRIPTION = "This YaST module installs the tools necessary for creating VMs with Xen or KVM."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-vm-5.0.1-1.2.aarch64.rpm"
RPM_HASH = "46d638fe159857782745c4e0d0200d4f8cc71d7c66f83fd448b62831ba9ee4ae37f35226bfafb60834552971e50b74de37c2788175146b13ec64796df4ce9aa1"

RPROVIDES:${PN} += "yast2-vm"

RDEPENDS:${PN} += "yast2 \
yast2-bootloader \
yast2-network \
yast2-ruby-bindings"

inherit rpm
