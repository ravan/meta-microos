SUMMARY = "Ruby/EventMachine library"
DESCRIPTION = "EventMachine implements a fast, single-threaded engine for arbitrary network \
communications. It's extremely easy to use in Ruby. EventMachine wraps all \
interactions with IP sockets, allowing programs to concentrate on the \
implementation of network protocols. It can be used to create both network \
servers and clients. To create a server or client, a Ruby program only needs \
to specify the IP address and port, and provide a Module that implements the \
communications protocol. Implementations of several standard network protocols \
are provided with the package, primarily to serve as examples. The real goal \
of EventMachine is to enable programs to easily interface with other programs \
using TCP/IP, especially if custom protocols are required."
LICENSE = "Ruby | GPL-2.0-only"

PV = "1.2.7"

RPM_NAME = "ruby4.0-rubygem-eventmachine-1.2.7-1.50.aarch64.rpm"
RPM_HASH = "76f4a7fdfc7c18f1d388baafe9e5afa72ed430947f6666b34bed01852e5bba34c4d00dc6659d5c3f95b289813df52687f9d66cdafa42a8043316729919129cfe"

RPROVIDES:${PN} += "ruby4.0-rubygem-eventmachine \
rubygem-eventmachine \
rubygem-ruby-4.0.0-eventmachine \
rubygem-ruby-4.0.0-eventmachine-1 \
rubygem-ruby-4.0.0-eventmachine-1.2 \
rubygem-ruby-4.0.0-eventmachine-1.2.7"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libruby4.0.so.4.0 \
libssl.so.3 \
libstdc++.so.6 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
