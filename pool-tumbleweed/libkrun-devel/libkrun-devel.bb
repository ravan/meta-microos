SUMMARY = "Header files and libraries for libkrun development"
DESCRIPTION = " \
libkrun is a dynamic library that allows programs to easily acquire the \
ability to run processes in a partially isolated environment using KVM Virtualization. \
It integrates a VMM (Virtual Machine Monitor, the userspace side of an Hypervisor) with \
the minimum amount of emulated devices required to its purpose, abstracting most of the \
complexity that comes from Virtual Machine management, offering users a simple C API. \
 \
This package containes the libraries and headers needed to develop programs \
that use libkrun Virtualization-based process isolation capabilities."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "libkrun-devel-1.19.0-1.3.aarch64.rpm"
RPM_HASH = "c0060593e8bdbe728c61dd33adfd191c5b4c73d42cc680fb22bc1ad695e47b82e6fe6d250c84cc8d4daa9f045fa3c85e3d3fbabb67bc814528e86a002f19eab1"

RPROVIDES:${PN} += "libkrun-/usr/lib64/libkrun.so \
libkrun-devel \
pkgconfig-libkrun"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkrun1"

inherit rpm
