SUMMARY = "Simple traffic shaping utility for fighting bufferbloat"
DESCRIPTION = "The Problem: Bufferbloat (see http://en.wikipedia.org/wiki/Bufferbloat) \
 \
    - Your SSH session turns to molasses when your kid watches YouTube \
    - Your wife complains that 'the internet is slow' \
    - You hate the stupid DSL modems supplied by the phone company \
      with their giant packet queues that add unnecessary latency \
    - You have your own Linux router that routes all your traffic \
      or is the only machine you have connected to the Internet \
      and know there must be a better way \
 \
The Solution: QoS \
 \
    QoS = 'Quality of Service' \
 \
    You probably already know about it. Control and proritize traffic. \
 \
    This QoS is new and improved. Previous QoS setups only throttled \
    traffic in the download direction. This one handles both directions \
    using the (poorly documented) Linux ifb interface and tc(8) 'mirred' \
    redirection."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "qos-1.0.1-9.15.noarch.rpm"
RPM_HASH = "2644074c80b5937a1b43f3933ca6614c761ceb8e8c640cfb00b48ba62f5425b09c0a7fb4d3020442b22ecbf408196ee3f061800d2c339a23d4c1c59f1a45573c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qos"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
iproute2 \
systemd"

inherit rpm
