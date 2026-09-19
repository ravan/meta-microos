SUMMARY = "Development files for the ip_queue kernel mechanism"
DESCRIPTION = "The Netfilter project provides a mechanism (ip_queue) for passing \
packets out of the stack for queueing to userspace, then receiving \
these packets back into the kernel with a verdict specifying what to \
do with the packets (such as ACCEPT or DROP). These packets may also \
be modified in userspace prior to reinjection back into the kernel. \
 \
ip_queue/libipq is obsoleted by nf_queue/libnetfilter_queue!"
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.13"

RPM_NAME = "libipq-devel-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "eb0c64108ee2bcab68db245627156e5764e500f7b4d0335d84adb80a0694b3284c6515366d4c1f5d2936dd5b6a5f9d842149c7395b17766ae650865547c9e020"

RPROVIDES:${PN} += "libipq-devel \
pkgconfig-libipq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipq0"

inherit rpm
