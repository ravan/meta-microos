SUMMARY = "An Interactive text-mode Process Viewer for Linux"
DESCRIPTION = "htop is an interactive text-mode process viewer for Linux. It aims to be a \
better 'top' and requires ncurses."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.3"

RPM_NAME = "htop-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "8a7efdd215b70b7db649c83ffcc749c2eb32e88e85a9bd9cbeff2fd09d53d85590961946ecf0b082474e7a3f7478f4bbcd8f85859824aaeb3af43fd85d6eb6ff"

RPROVIDES:${PN} += "htop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libhwloc.so.15 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libunwind-aarch64.so.8 \
libunwind-ptrace.so.0 \
libunwind.so.8"

inherit rpm
