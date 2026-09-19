SUMMARY = "NUMA Policy Control"
DESCRIPTION = "Control NUMA policy for individual processes. Offer libnuma for \
individual NUMA policy in applications."
LICENSE = "GPL-2.0-only"

PV = "2.0.19.27.gc9475de"

RPM_NAME = "numactl-2.0.19.27.gc9475de-1.3.aarch64.rpm"
RPM_HASH = "58530273cdfb188f9dec0c3c71e4ad4b8ed3760dea1097fee0f78cd2341f846e56ce9f7c4845253759b398bed18da49a8191c5d18ea8e4953007cf8ae143e409"

RPROVIDES:${PN} += "numactl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnuma.so.1"

inherit rpm
