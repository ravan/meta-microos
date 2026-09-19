SUMMARY = "Userspace tools for TOMOYO Linux 2.4.x"
DESCRIPTION = "This package contains userspace tools for administrating TOMOYO Linux 2.4. \
Please see http://tomoyo.sourceforge.jp/2.4/ for documentation."
LICENSE = "GPL-2.0-only"

PV = "2.6.1.20210910"

RPM_NAME = "tomoyo-tools-2.6.1.20210910-1.19.aarch64.rpm"
RPM_HASH = "61c6614ec07762055b96e6d8c487f68d2de77e493df4b1d8c46b9727d947814890aefb46e10f73cc3a634c7affac4926185ad5946cbfa3adaa5e510c74da01c7"

RPROVIDES:${PN} += "libtomoyotools.so.3 \
tomoyo-tools"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
