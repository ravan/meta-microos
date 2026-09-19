SUMMARY = "Multiple Host Ping Library that supports ICMPv4 and ICMPv6"
DESCRIPTION = "liboping is a C library for measuring network latency using ICMP echo \
requests. It can send to and receive packets from multiple hosts in parallel, \
which is nice for monitoring applications. Both IPv4 and IPv6 are supported \
transparently for the programmer and user. \
 \
A program called oping is available on the oping package to show the \
simplicity and potential of the library and provide the functionality at the \
command line."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "liboping0-1.10.0-2.15.aarch64.rpm"
RPM_HASH = "c477e044ad8cb6a9be3a5d8c34b00ee7fb5595bf19f5073784cf5c961ee7927c466ce8c4f323f786084dc261eef377ce977fd494ad12ae2690b71c4999dcbc5f"

RPROVIDES:${PN} += "liboping \
liboping.so.0 \
liboping0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
