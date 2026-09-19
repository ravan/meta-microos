SUMMARY = "Development files for libiptc, a packet filter ruleset library"
DESCRIPTION = "libiptc ('iptables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.13"

RPM_NAME = "libiptc-devel-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "fc5b9875b005e247094f39a575bee09d8ca2c9d5cbe8faa411bc4b9e63a315a57e1db1d274e63334126d1dc654f981c88fd97de0b8db0357cdc75b9a300bb261"

RPROVIDES:${PN} += "libiptc-devel \
pkgconfig-libip4tc \
pkgconfig-libip6tc \
pkgconfig-libiptc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libip4tc2 \
libip6tc2 \
pkgconfig-libip4tc \
pkgconfig-libip6tc"

inherit rpm
