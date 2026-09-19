SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply5-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "4c92d570deb8e675c7a7d719463ec78e03f1b936f3f68cdb473746d667fe99a04e12a487f02d811e06e6f79590de8ae99e120fa087055b5e9e6ca7bbeefd4e35"

RPROVIDES:${PN} += "libply.so.5 \
libply5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
