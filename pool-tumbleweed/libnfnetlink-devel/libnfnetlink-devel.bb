SUMMARY = "Low-level library for Netfilter-related kernel/userspace communication"
DESCRIPTION = "libnfnetlink is the low-level library for netfilter related \
kernel/userspace communication. \
 \
This library is not meant as a public API for application developers. \
It is only used by other netfilter.org projects, such as \
libnetfilter_log, libnetfilter_queue or libnetfilter_conntrack."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "libnfnetlink-devel-1.0.2-1.17.aarch64.rpm"
RPM_HASH = "10927f22967a780dfb5283856f78a9f64edaa9e299bffbf6e8c743746014a774bde3368967f442ca2f0ab42cca00224d6151b29638e6e9332ca604e8617be3c7"

RPROVIDES:${PN} += "libnfnetlink-devel \
pkgconfig-libnfnetlink"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfnetlink0"

inherit rpm
