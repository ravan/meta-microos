SUMMARY = "Development files for ipset extensions"
DESCRIPTION = "IP sets are a framework inside the Linux kernel, which can be \
administered by the ipset utility. Depending on the type, currently \
an IP set may store IP addresses, (TCP/UDP) port numbers or IP \
addresses with MAC addresses in a way, which ensures lightning speed \
when matching an entry against a set."
LICENSE = "GPL-2.0-only"

PV = "7.24"

RPM_NAME = "ipset-devel-7.24-1.6.aarch64.rpm"
RPM_HASH = "d5b91707ac2bb44fa47ba3a6500987dd3b00a1b3f851a2544d17d9f93541db1755a218d3390723f627e40acfc913334fdfff8973097fcb4b45812d642b0337f6"

RPROVIDES:${PN} += "ipset-devel \
pkgconfig-libipset"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipset13 \
pkgconfig-libmnl"

inherit rpm
