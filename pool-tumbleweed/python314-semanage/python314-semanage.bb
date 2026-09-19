SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.11"

RPM_NAME = "python314-semanage-3.11-1.2.aarch64.rpm"
RPM_HASH = "947eca15b92bd3adf974b3a76594b3d2125d5e7721757a968929dbf6b2566d1083920e0dad93f9ff074e463e8647b9905cb67f516646cc1f9e782158fbf8560a"

RPROVIDES:${PN} += "python314-semanage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsemanage.so.2 \
libsemanage2 \
python-abi"

inherit rpm
