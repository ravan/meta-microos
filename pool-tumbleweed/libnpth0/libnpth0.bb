SUMMARY = "GNU Portable Threads library"
DESCRIPTION = "nPth is a non-preemptive threads implementation using an API \
similar to the one in GNU Pth. In contrast to Pth, nPth is \
based on the system's standard threads implementation. Thus, nPth \
allows the use of libraries which are not compatible to GNU Pth."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libnpth0-1.8-2.6.aarch64.rpm"
RPM_HASH = "8c583f7828add818faa0b51fc8a746227385ec7dc1e45d1f78e7325f39674811ce808fb0aaaa8da56770d041d17d425842ca5ab989b775c3f47fa72b7a415d29"

RPROVIDES:${PN} += "libnpth.so.0 \
libnpth0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
