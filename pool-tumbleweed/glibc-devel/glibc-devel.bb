SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.44"

RPM_NAME = "glibc-devel-2.44-2.1.aarch64.rpm"
RPM_HASH = "167186ff43b98d8ea12268df647b90940728b58331d161cf82b17b8fc2e0759922f4822927f33e011b2117cceb33ba1c4433c64119390df5d827927b02a08d4f"

RPROVIDES:${PN} += "epoll \
glibc-devel"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcrypt-devel \
linux-kernel-headers"

inherit rpm
