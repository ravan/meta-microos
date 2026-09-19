SUMMARY = "Runtime libraries for hwloc"
DESCRIPTION = "This package contains the run time libraries for hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.13.0"

RPM_NAME = "libhwloc15-2.13.0-1.3.aarch64.rpm"
RPM_HASH = "3152940d8fd98284818caa03caa13bfa9849319673540eb0888a750ca15a050d8db03a8309f402ed28c27c48510e74b802b24b17d7ad75c97a52a60a6a12ccf7"

RPROVIDES:${PN} += "libhwloc.so.15 \
libhwloc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
hwloc-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpciaccess.so.0 \
libxml2.so.16"

inherit rpm
