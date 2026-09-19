SUMMARY = "A dynamic library providing KVM-based process isolation capabilities"
DESCRIPTION = " \
libkrun is a dynamic library that allows programs to easily acquire the \
ability to run processes in a partially isolated environment using KVM Virtualization. \
It integrates a VMM (Virtual Machine Monitor, the userspace side of an Hypervisor) with \
the minimum amount of emulated devices required to its purpose, abstracting most of the \
complexity that comes from Virtual Machine management, offering users a simple C API."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "libkrun1-1.19.0-1.3.aarch64.rpm"
RPM_HASH = "50d16b2f8e2d52ad7828823401f8f1a0d60424d50660691bef26fa9777d6b4d1b04224ab3b522ed031bb4a2b0df79e4c936f51919e70f665d89e409f3f3fa0bd"

RPROVIDES:${PN} += "libkrun.so.1 \
libkrun1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libkrunfw5 \
libpipewire-0.3.so.0 \
libvirglrenderer.so.1"

inherit rpm
