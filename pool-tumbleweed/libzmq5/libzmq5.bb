SUMMARY = "Shared Library for ZeroMQ"
DESCRIPTION = "The ZeroMQ messaging kernel is a library extending the standard \
socket interfaces with an abstraction of asynchronous message queues, \
multiple messaging patterns, message filtering (subscriptions) and \
seamless access to multiple transport protocols. \
 \
This package holds the shared library part of the ZeroMQ package."
LICENSE = "MPL-2.0"

PV = "4.3.5"

RPM_NAME = "libzmq5-4.3.5-1.12.aarch64.rpm"
RPM_HASH = "faee5e88ce24b9f19b567e1fc8b375c5558bf320acc5b0f4364728564bad49b536e38940077c072ecb042a5fb3157c778ae6da2ffddfbd382c01c0c5a127b419"

RPROVIDES:${PN} += "libzmq.so.5 \
libzmq5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsodium.so.26 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
