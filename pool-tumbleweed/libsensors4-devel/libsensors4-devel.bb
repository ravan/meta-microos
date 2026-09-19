SUMMARY = "Hardware health monitoring library"
DESCRIPTION = "libsensors offers a way for applications to access the hardware \
monitoring chips of the system. A system-dependent configuration file \
controls how the different inputs are labeled and what scaling factors \
have to be applied for the specific hardware, so that the output makes \
sense to the user."
LICENSE = "LGPL-2.1-or-later"

PV = "3.6.2"

RPM_NAME = "libsensors4-devel-3.6.2-5.4.aarch64.rpm"
RPM_HASH = "595ab76948c91c8da228c63f620e68d91e63790e9ab81e1c3a6f922db6cb5c1709146814bbd0ed9bb22e67f411ba4831cb81202b42191998cfc4c7dfde145c83"

RPROVIDES:${PN} += "libsensors4-devel \
sensors-/usr/include/sensors/sensors.h"

RDEPENDS:${PN} += "glibc-devel \
libsensors4"

inherit rpm
