SUMMARY = "Library for the ip_tables low-level ruleset generation and parsing (IPv4)"
DESCRIPTION = "libiptc ('iptables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel. \
This package contains the iptc IPv4 API."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.13"

RPM_NAME = "libip4tc2-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "fe66ea2158ce08b6f0cf97b14b7ee4604407d879dde73185da89e49c2967c56be2f3b22ad4720c4b1ada434d672ebcd79a7307048d56e8d9e3246490d656a91b"

RPROVIDES:${PN} += "libip4tc.so.2 \
libip4tc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
