SUMMARY = "A signal-forwarding process manager for containers"
DESCRIPTION = "Catatonit is a /sbin/init program for use within containers. It \
forwards (almost) all signals to the spawned child, tears down \
the container when the spawned child exits, and otherwise \
cleans up other exited processes (zombies). \
 \
This is a reimplementation of other container init programs (such as \
'tini' or 'dumb-init'), but uses modern Linux facilities (such as \
signalfd(2)) and has no additional features."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1"

RPM_NAME = "catatonit-0.2.1-1.8.aarch64.rpm"
RPM_HASH = "553a8965ca644fdea39498706178e1cdb17ad8f2a0c27e73f84363349182586945e72429d65d82fbd69ecffe881c12fe6a49774069b0a22122585b8f17406c53"

RPROVIDES:${PN} += "catatonit"

RDEPENDS:${PN} += ""

inherit rpm
