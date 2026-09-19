SUMMARY = "Microsoft Hyper-V tools"
DESCRIPTION = "This package contains the Microsoft Hyper-V tools."
LICENSE = "GPL-2.0-only"

PV = "9"

RPM_NAME = "hyper-v-9-5.3.aarch64.rpm"
RPM_HASH = "c13dc86bef655a79b3038cad545fa0ce7891d6a3ddc458507f3a64bc575530e9391215c4efe5421de3b3ae74345bcc6c912f487dc6dbd276d61fd6bdd1a3943c"

RPROVIDES:${PN} += "hyper-v"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
