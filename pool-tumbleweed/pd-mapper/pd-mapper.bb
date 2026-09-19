SUMMARY = "Qualcomm Protection Domain mapper"
DESCRIPTION = "Qualcomm protection domain mapper service, which is required by userspace \
applications to access remote processors [Wifi, modem, sensors, battery, etc] \
on Qualcomm SoCs using the QRTR protocol."
LICENSE = "BSD-3-Clause"

PV = "1.0~git20230901.10997ba"

RPM_NAME = "pd-mapper-1.0~git20230901.10997ba-1.10.aarch64.rpm"
RPM_HASH = "8911a1091364703c30ff954f198e8c02f1bd4ed8576d13e885993d13fabc59fc16300d2d4ed4b8a41dd782482f2e8f121e299eec50c2f5be466ffbbf59addb2c"

RPROVIDES:${PN} += "pd-mapper"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
liblzma.so.5 \
libqrtr.so.1 \
qrtr"

inherit rpm
