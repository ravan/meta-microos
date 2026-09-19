SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "vhostmd-1.2-3.7.aarch64.rpm"
RPM_HASH = "7a7f0bc65eca82f4b4bcb05233519926aa0f8e8ffd3ef5f080de5192e8f1d1cbdaa0b76b21155ef5b545203487d3340bcdbceeb7b5e14bac659deac3ac72840a"

RPROVIDES:${PN} += "config-vhostmd \
vhostmd"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt.so.0 \
libxml2.so.16"

inherit rpm
