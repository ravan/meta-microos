SUMMARY = "Proxy for Wayland clients"
DESCRIPTION = "waypipe is a proxy for Wayland clients. It forwards Wayland messages \
and serializes changes to shared memory buffers over a single socket. \
This makes application forwarding similar to `ssh -X` feasible. \
 \
Waypipe needs to be run on both ends of a socket connection. It \
emulates shared files between the different systems on each end of \
the connection, using twin file copies to quickly identify file \
changes. \
 \
It supports both shared-memory and DMABUFs. Performance on a local \
network is kind of acceptable for terminals and relatively static \
applications, but games are often unplayable due to FPS drop from the \
delay needed to send a screenful of data over the network."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.11.0"

RPM_NAME = "waypipe-0.11.0-1.5.aarch64.rpm"
RPM_HASH = "7b5252c4ef7d95e3d88df3e95eab181b371a171e82556a09ce1fe135b94ef9eed5183677f5019d5c0fbac1810a9ad4cf0bf6a1aac0e775fb1d107e1c1382f092"

RPROVIDES:${PN} += "waypipe"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
libzstd.so.1"

inherit rpm
