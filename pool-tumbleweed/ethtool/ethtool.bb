SUMMARY = "Utility for examining and tuning Ethernet-based network interfaces"
DESCRIPTION = "Ethtool is a small utility for examining and tuning ethernet-based \
network interfaces.  See the man page for more details."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "ethtool-7.1-1.2.aarch64.rpm"
RPM_HASH = "ff794dce27b1ba6882a15dc9564d0cef70ad73d50038a82a006c90c9317c9ad11ebc9e249c39dd4b76e422d5bf682c9b9a3e5b17a442bd9ea7e55af8849be35a"

RPROVIDES:${PN} += "ethtool \
ethtool-bash-completion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmnl.so.0"

inherit rpm
