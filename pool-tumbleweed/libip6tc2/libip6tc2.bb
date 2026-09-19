SUMMARY = "Library for the ip_tables low-level ruleset generation and parsing (IPv6)"
DESCRIPTION = "libiptc ('iptables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel. \
This package contains the iptc IPv6 API."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.13"

RPM_NAME = "libip6tc2-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "c0688bc3239f8803322e273387f7c17489e6a3242f9be6a7c287f1cf9c9505900b557b98b0f2f85520b89c278170a5bbc1b0709e8c084bad25cca6b29e3d317e"

RPROVIDES:${PN} += "libip6tc.so.2 \
libip6tc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
