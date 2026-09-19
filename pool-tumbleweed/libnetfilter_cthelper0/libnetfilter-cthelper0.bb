SUMMARY = "Userspace library for the Netfilter Conntrack Helper extension"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter userspace helper infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libnetfilter_cthelper0-1.0.1-1.15.aarch64.rpm"
RPM_HASH = "f4d7b61c50098e7460a5275f398b7e875645ef932e7a64ada1709266d672020a776b1ec5062ae64770dafe3dec9b707fdb4f607ee1deedaab691cf5480bb4547"

RPROVIDES:${PN} += "libnetfilter-cthelper.so.0 \
libnetfilter-cthelper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
