SUMMARY = "Library for the ebtables low-level ruleset generation and parsing"
DESCRIPTION = "libebtc ('ebtables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.11"

RPM_NAME = "libebtc0-2.0.11-5.19.aarch64.rpm"
RPM_HASH = "049deccca80eb95ab6e3b1c265cfa96c6d8f74e8a11480cdf172e0fe10d7a7ec3ea542bc2ffd100b4cb5d0ecb999304c2fea705c8b22fd8f939ca497df0745df"

RPROVIDES:${PN} += "libebtc.so.0 \
libebtc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
