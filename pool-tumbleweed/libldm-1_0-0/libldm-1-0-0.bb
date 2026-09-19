SUMMARY = "Library to manage Windows dynamic disks"
DESCRIPTION = "Library for managing Microsoft Windows dynamic disks, which use Microsoft's \
LDM metadata. It can inspect them, and also create and remove device-mapper \
block devices which can be mounted."
LICENSE = "LGPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "libldm-1_0-0-0.2.5-1.7.aarch64.rpm"
RPM_HASH = "92e7e84aceed5558fb45d2383ed94fd86daedeb7067bba74a0d67c1377be3b0219a05f116ded18672b0a00572ea0d30111303f611ff2b05e918ed22be2151645"

RPROVIDES:${PN} += "libldm-1-0-0 \
libldm-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libuuid.so.1 \
libz.so.1"

inherit rpm
