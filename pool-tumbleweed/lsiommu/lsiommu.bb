SUMMARY = "List IOMMU groups with their PCIe devices and USB controllers"
DESCRIPTION = "A hardware inspection utility that shows the relationships between \
IOMMU groups, physical PCIe hardware, and nested USB buses. \
 \
It is commonly used when setting up Kernel-based Virtual Machines (KVM) with \
VFIO hardware passthrough (i.e., PCIe passthrough of a host device, such as a \
graphics card or a network interface) to a guest VM."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "lsiommu-1.0-1.1.noarch.rpm"
RPM_HASH = "a8217f7d91e90987138e1f3588c302a8ed4eedab9677ecfb31eba8686cd3d8f33f46a9913a63bcba8a8bd98f21d16df17cc461d0bb655942b063a5f74a38bb8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsiommu"

RDEPENDS:${PN} += "/usr/bin/bash \
pciutils \
usbutils"

inherit rpm
