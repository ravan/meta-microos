SUMMARY = "Buddyinfo plugin for collectd"
DESCRIPTION = "Optional collectd plugin for memory fragmentation."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-buddyinfo-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "e65fe2423e8bbf464de48f3174edb7099c39b4460baeaf5726b52b5b244809eba68553f81c5acc9eca2f5391d9fa1df029b98b93a6efad7ae2b1bffb419faaef"

RPROVIDES:${PN} += "collectd-plugin-buddyinfo"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
