SUMMARY = "Automatically restart SSH sessions and tunnels"
DESCRIPTION = "Autossh is a program to start a copy of ssh and monitor it, restarting \
it as necessary should it die or stop passing traffic. The idea and \
the mechanism are from rstunnel (Reliable SSH Tunnel), but implemented \
in C. The author's view is that it is not as fiddly as rstunnel to get \
to work. Connection monitoring using a loop of port forwardings. Backs \
off on rate of connection attempts when experiencing rapid failures \
such as connection refused."
LICENSE = "BSD-3-Clause"

PV = "1.4g"

RPM_NAME = "autossh-1.4g-2.24.aarch64.rpm"
RPM_HASH = "19fc297378d44ca751d5f41137b42ee8d39ab14958781b2d5c689490ef3d88270549309d829412d445356c8744eacae217ff85975c0a7c5cea4bf4215cf029c9"

RPROVIDES:${PN} += "autossh"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
openssh"

inherit rpm
