SUMMARY = "GNU variant of universal network utility"
DESCRIPTION = "Netcat is a networking utility which reads and writes data across \
network connections. It is a 'back-end' tool that can be used \
directly or driven by other programs and scripts. It is also a \
network debugging and exploration tool, since it can create a number \
of connection types. It provides the following main features: \
 \
  * Outbound and inbound connections, TCP or UDP, to or from any ports. \
  * Tunneling mode which allows also tunneling such as UDP to \
    TCP, with the possibility of specifying all network parameters (source \
    port/interface, listening port/interface, and the remote host allowed to \
    connect to the tunnel. \
  * Built-in port-scanning capabilities, with randomizer. \
  * Advanced usage options, such as buffered send-mode (one line every N \
    seconds), and hexdump (to stderr or to a specified file) of trasmitted and \
    received data. \
  * Optional RFC854 telnet codes parser and responder."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "gnu-netcat-0.7.1-5.27.aarch64.rpm"
RPM_HASH = "7067cfa5bfde30f5bf2a918a34bcd7c16ebd22ef841b89d8ef161f9441da459a1db4f897d835f0003ad91f4df53fedfb4b7126c0779550577f35a45f0e84818b"

RPROVIDES:${PN} += "gnu-netcat"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
