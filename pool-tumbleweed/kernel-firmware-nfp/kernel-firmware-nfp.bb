SUMMARY = "Kernel firmware files for Netronome Flow Processor driver"
DESCRIPTION = "This package contains kernel firmware files for Netronome Flow Processor driver."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260610"

RPM_NAME = "kernel-firmware-nfp-20260610-1.2.noarch.rpm"
RPM_HASH = "e17534acbde2dda8b276783a4d3dbbaaac5e1c1f6f1cb6ac9cdc71e5277d1e0c3fb682089b25a33ff6038badddfcadf879331b0a15dfe7e97b455c9ae2ea73fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-netronome/bpf/nic-AMDA0058-0011-2x40.nffw \
firmware-netronome/bpf/nic-AMDA0058-0012-2x40.nffw \
firmware-netronome/bpf/nic-AMDA0078-0011-1x100.nffw \
firmware-netronome/bpf/nic-AMDA0081-0001-1x40.nffw \
firmware-netronome/bpf/nic-AMDA0081-0001-4x10.nffw \
firmware-netronome/bpf/nic-AMDA0096-0001-2x10.nffw \
firmware-netronome/bpf/nic-AMDA0097-0001-2x40.nffw \
firmware-netronome/bpf/nic-AMDA0097-0001-4x10-1x40.nffw \
firmware-netronome/bpf/nic-AMDA0097-0001-8x10.nffw \
firmware-netronome/bpf/nic-AMDA0099-0001-1x10-1x25.nffw \
firmware-netronome/bpf/nic-AMDA0099-0001-2x10.nffw \
firmware-netronome/bpf/nic-AMDA0099-0001-2x25.nffw \
firmware-netronome/flower/nic-AMDA0058-0011-1x100.nffw \
firmware-netronome/flower/nic-AMDA0058-0011-2x40.nffw \
firmware-netronome/flower/nic-AMDA0058-0011-4x10-1x40.nffw \
firmware-netronome/flower/nic-AMDA0058-0011-8x10.nffw \
firmware-netronome/flower/nic-AMDA0058-0012-1x100.nffw \
firmware-netronome/flower/nic-AMDA0058-0012-2x40.nffw \
firmware-netronome/flower/nic-AMDA0058-0012-4x10-1x40.nffw \
firmware-netronome/flower/nic-AMDA0058-0012-8x10.nffw \
firmware-netronome/flower/nic-AMDA0058.nffw \
firmware-netronome/flower/nic-AMDA0078-0011-1x100.nffw \
firmware-netronome/flower/nic-AMDA0078-0011-2x40.nffw \
firmware-netronome/flower/nic-AMDA0078-0011-4x10-1x40.nffw \
firmware-netronome/flower/nic-AMDA0078-0011-8x10.nffw \
firmware-netronome/flower/nic-AMDA0078-0012-1x100.nffw \
firmware-netronome/flower/nic-AMDA0078-0012-2x40.nffw \
firmware-netronome/flower/nic-AMDA0078-0012-4x10-1x40.nffw \
firmware-netronome/flower/nic-AMDA0078-0012-8x10.nffw \
firmware-netronome/flower/nic-AMDA0081-0001-1x40.nffw \
firmware-netronome/flower/nic-AMDA0081-0001-4x10.nffw \
firmware-netronome/flower/nic-AMDA0081.nffw \
firmware-netronome/flower/nic-AMDA0096-0001-2x10.nffw \
firmware-netronome/flower/nic-AMDA0096.nffw \
firmware-netronome/flower/nic-AMDA0097-0001-2x40.nffw \
firmware-netronome/flower/nic-AMDA0097-0001-4x10-1x40.nffw \
firmware-netronome/flower/nic-AMDA0097-0001-8x10.nffw \
firmware-netronome/flower/nic-AMDA0097.nffw \
firmware-netronome/flower/nic-AMDA0099-0001-1x10-1x25.nffw \
firmware-netronome/flower/nic-AMDA0099-0001-2x10.nffw \
firmware-netronome/flower/nic-AMDA0099-0001-2x25.nffw \
firmware-netronome/flower/nic-AMDA0099.nffw \
firmware-netronome/nic-AMDA0058-0011-2x40.nffw \
firmware-netronome/nic-AMDA0058-0012-2x40.nffw \
firmware-netronome/nic-AMDA0078-0011-1x100.nffw \
firmware-netronome/nic-AMDA0081-0001-1x40.nffw \
firmware-netronome/nic-AMDA0081-0001-4x10.nffw \
firmware-netronome/nic-AMDA0096-0001-2x10.nffw \
firmware-netronome/nic-AMDA0097-0001-2x40.nffw \
firmware-netronome/nic-AMDA0097-0001-4x10-1x40.nffw \
firmware-netronome/nic-AMDA0097-0001-8x10.nffw \
firmware-netronome/nic-AMDA0099-0001-1x10-1x25.nffw \
firmware-netronome/nic-AMDA0099-0001-2x10.nffw \
firmware-netronome/nic-AMDA0099-0001-2x25.nffw \
firmware-netronome/nic-sriov/nic-AMDA0058-0011-2x40.nffw \
firmware-netronome/nic-sriov/nic-AMDA0058-0012-2x40.nffw \
firmware-netronome/nic-sriov/nic-AMDA0078-0011-1x100.nffw \
firmware-netronome/nic-sriov/nic-AMDA0081-0001-1x40.nffw \
firmware-netronome/nic-sriov/nic-AMDA0081-0001-4x10.nffw \
firmware-netronome/nic-sriov/nic-AMDA0096-0001-2x10.nffw \
firmware-netronome/nic-sriov/nic-AMDA0097-0001-2x40.nffw \
firmware-netronome/nic-sriov/nic-AMDA0097-0001-4x10-1x40.nffw \
firmware-netronome/nic-sriov/nic-AMDA0097-0001-8x10.nffw \
firmware-netronome/nic-sriov/nic-AMDA0099-0001-1x10-1x25.nffw \
firmware-netronome/nic-sriov/nic-AMDA0099-0001-2x10.nffw \
firmware-netronome/nic-sriov/nic-AMDA0099-0001-2x25.nffw \
firmware-netronome/nic/nic-AMDA0058-0011-2x40.nffw \
firmware-netronome/nic/nic-AMDA0058-0012-2x40.nffw \
firmware-netronome/nic/nic-AMDA0078-0011-1x100.nffw \
firmware-netronome/nic/nic-AMDA0081-0001-1x40.nffw \
firmware-netronome/nic/nic-AMDA0081-0001-4x10.nffw \
firmware-netronome/nic/nic-AMDA0096-0001-2x10.nffw \
firmware-netronome/nic/nic-AMDA0097-0001-2x40.nffw \
firmware-netronome/nic/nic-AMDA0097-0001-4x10-1x40.nffw \
firmware-netronome/nic/nic-AMDA0097-0001-8x10.nffw \
firmware-netronome/nic/nic-AMDA0099-0001-1x10-1x25.nffw \
firmware-netronome/nic/nic-AMDA0099-0001-2x10.nffw \
firmware-netronome/nic/nic-AMDA0099-0001-2x25.nffw \
kernel-firmware-nfp"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
