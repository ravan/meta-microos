SUMMARY = "CPU emulator for user space"
DESCRIPTION = "QEMU provides CPU emulation along with other related capabilities. This package \
provides programs to run user space binaries and libraries meant for another \
architecture. The syscall interface is intercepted and execution below the \
syscall layer occurs on the native hardware and operating system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-linux-user-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "ffdb48df84e714ebfe76f070e2fc3f683f0601e53efa3dd1eb0d25aaa178d86ba2925aa55b058a85f6b5655db6c91fd569dec96a50399ae19e752f6f49c60d75"

RPROVIDES:${PN} += "qemu-linux-user"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
