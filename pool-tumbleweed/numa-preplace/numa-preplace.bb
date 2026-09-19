SUMMARY = "Userspace tool for binding VMs to NUMA nodes"
DESCRIPTION = "Once upon a time, there was numad. These days, there is no need of having it \
running as a daemon. However, the service of 'pre-placement' of a VM (i.e., \
deciding on which NUMA node[s] place the VM, while it's being created) is \
still valuable. And that's what this package aims at offering."
LICENSE = "LGPL-2.1-only"

PV = "0.1"

RPM_NAME = "numa-preplace-0.1-1.6.aarch64.rpm"
RPM_HASH = "6a43c0e84e49a52297796d1180c0cd0ba65114ebcf2c8574852c7d50ea882f53bb542306f32f7e3088b88ce5f43da08d9ff539842e0baa6436c6575a54e3d29b"

RPROVIDES:${PN} += "numa-preplace"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
