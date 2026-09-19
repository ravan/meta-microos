SUMMARY = "System-wide crypto policies"
DESCRIPTION = "This package provides pre-built configuration files with \
cryptographic policies for various cryptographic back-ends, \
such as SSL/TLS libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "20250714.cd6043a"

RPM_NAME = "crypto-policies-20250714.cd6043a-5.2.noarch.rpm"
RPM_HASH = "3865e20b0fe577f9b1415c45bff913ca2289d245dd163ebf2998aab5be387f7b40c6fa0509d2beeaa7b8c4e480fcd28206370fa90749059db8ebdc4a52ca4d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-crypto-policies \
crypto-policies"

RDEPENDS:${PN} += ""

inherit rpm
