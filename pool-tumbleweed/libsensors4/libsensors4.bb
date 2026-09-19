SUMMARY = "Hardware health monitoring library"
DESCRIPTION = "libsensors offers a way for applications to access the hardware \
monitoring chips of the system. A system-dependent configuration file \
controls how the different inputs are labeled and what scaling factors \
have to be applied for the specific hardware, so that the output makes \
sense to the user."
LICENSE = "LGPL-2.1-or-later"

PV = "3.6.2"

RPM_NAME = "libsensors4-3.6.2-5.4.aarch64.rpm"
RPM_HASH = "077c8e272d5fab544b5fe333e07a0862321df8ca0ef11794a7d42ac260f68a9011d33c898d9adb5a241691bb406a4403b86d5d9545c44d1c8a0c0f65340f5904"

RPROVIDES:${PN} += "config-libsensors4 \
libsensors.so.4 \
libsensors4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
