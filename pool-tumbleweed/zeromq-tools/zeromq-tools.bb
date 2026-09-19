SUMMARY = "Tools to work with ZeroMQ"
DESCRIPTION = "The ZeroMQ messaging kernel is a library extending the standard \
socket interfaces with an abstraction of asynchronous message queues, \
multiple messaging patterns, message filtering (subscriptions) and \
seamless access to multiple transport protocols. \
 \
This package contains the utilities to work with ZeroMQ library."
LICENSE = "MPL-2.0"

PV = "4.3.5"

RPM_NAME = "zeromq-tools-4.3.5-1.12.aarch64.rpm"
RPM_HASH = "539978344e9fb70ed43316cc2dd152ad232e5b99766fee339ff31918e2f3d00ba64cba516913f170784352b63cec978aad870df93df84e8375a1bbf4c55415bb"

RPROVIDES:${PN} += "zeromq-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5"

inherit rpm
