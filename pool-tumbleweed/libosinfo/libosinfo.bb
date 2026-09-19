SUMMARY = "Operating system and hypervisor information management library"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.12.0"

RPM_NAME = "libosinfo-1.12.0-3.6.aarch64.rpm"
RPM_HASH = "6960d49379155e6c27e09dd494293bb3f875c17c91c8bdc17673c0523581c26b35d9bbc2c2a76eb5e046c1e0395e36e0cddf1193587f7fa89cb028fcaf0fbb28"

RPROVIDES:${PN} += "libosinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libosinfo-1.0.so.0 \
osinfo-db"

inherit rpm
