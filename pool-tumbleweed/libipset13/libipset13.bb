SUMMARY = "Userspace library for the in-kernel Netfilter ipset interface"
DESCRIPTION = "IP sets are a framework inside the Linux kernel, which can be \
administered by the ipset utility. Depending on the type, currently \
an IP set may store IP addresses, (TCP/UDP) port numbers or IP \
addresses with MAC addresses in a way, which ensures lightning speed \
when matching an entry against a set."
LICENSE = "GPL-2.0-only"

PV = "7.24"

RPM_NAME = "libipset13-7.24-1.6.aarch64.rpm"
RPM_HASH = "e33ecce9bc386c94aedf196f7a2404b19eea4646ad26aee862422956b207de92ac081325c75b21b88a4f4defc29203ae4e67b16d80c9169f6e30809d9be6e0e5"

RPROVIDES:${PN} += "libipset.so.13 \
libipset13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
