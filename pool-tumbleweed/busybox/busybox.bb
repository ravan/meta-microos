SUMMARY = "Minimalist variant of UNIX utilities linked in a single executable"
DESCRIPTION = "BusyBox combines tiny versions of many common UNIX utilities into a \
single executable. It provides minimalist replacements for utilities \
usually found in fileutils, shellutils, findutils, textutils, grep, \
gzip, tar, and more. BusyBox provides a fairly complete POSIX \
environment for small or embedded systems. The utilities in BusyBox \
generally have fewer options than their GNU cousins. The options that \
are included provide the expected functionality and behave much like \
their GNU counterparts. \
BusyBox is for emergency and special use cases. Replacing the standard \
tools in a system is not supported. Some tools don't work out of the \
box but need special configuration, like udhcpc, the dhcp client."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-1.38.0-2.1.aarch64.rpm"
RPM_HASH = "695b67c05d93c1ef03c9785a318174839bdad1264434e7d2f7805dee99872cd1b9763199b7308e31f95047d9311b3b15252120d109a04975409b777cb27f3ca1"

RPROVIDES:${PN} += "busybox \
config-busybox \
useradd-or-adduser-dep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libselinux.so.1 \
libsepol.so.2"

inherit rpm
