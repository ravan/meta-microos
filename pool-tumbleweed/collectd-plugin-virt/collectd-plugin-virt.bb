SUMMARY = "Virtual Machine Statistics Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to gather statistics from virtual \
machines using libvirt."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-virt-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "6c3f2e21400fac001fca72c3fd780cfbf460d9fbd1b43f65015eb325b299b7ca5c1a72bf6bd67af961043dccdd32a6d17cfbfc6403757d3763e35f1b0083996b"

RPROVIDES:${PN} += "collectd-plugin-virt"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt.so.0 \
libxml2.so.16"

inherit rpm
