SUMMARY = "Library to interface with the (old) ip_queue kernel mechanism"
DESCRIPTION = "The Netfilter project provides a mechanism (ip_queue) for passing \
packets out of the stack for queueing to userspace, then receiving \
these packets back into the kernel with a verdict specifying what to \
do with the packets (such as ACCEPT or DROP). These packets may also \
be modified in userspace prior to reinjection back into the kernel. \
 \
ip_queue/libipq is obsoleted by nf_queue/libnetfilter_queue!"
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.13"

RPM_NAME = "libipq0-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "5919b81e3319b82c606fc0ce419768f9841710c908694f50f681a00796a01e55e2a3aeb0d072dfd1182dd5d36831402dd3a7de2be737fab1bd1ab222443d1bbd"

RPROVIDES:${PN} += "libipq.so.0 \
libipq0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
