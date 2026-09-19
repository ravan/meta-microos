SUMMARY = "Distributed Lock Manager"
DESCRIPTION = "FLoM is a distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. When used \
in a shell environment, FLoM manages process synchronization in the same way \
that 'nice' manages process prioritization. It supports networking, abstract \
resources, offers a library, encryption and peer authentication."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "flom-1.6.1-2.11.aarch64.rpm"
RPM_HASH = "5bdb211c389e0626813a47f4e547da348d361787b20fccfa7f3583bb9fd196966f0933496140dbc5e34bc8612da1e5b047e2e63603362894f799ead3e797845c"

RPROVIDES:${PN} += "flom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libflom.so.0 \
libglib-2.0.so.0"

inherit rpm
