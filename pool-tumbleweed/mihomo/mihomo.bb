SUMMARY = "The universal proxy platform"
DESCRIPTION = "mihomo (formerly Clash.Meta) is a rule-based tunnel / universal proxy platform \
written in Go. It is the actively maintained successor to the original clash."
LICENSE = "GPL-3.0-only & MPL-2.0"

PV = "1.19.30"

RPM_NAME = "mihomo-1.19.30-1.1.aarch64.rpm"
RPM_HASH = "6846ce6871ac44a40da94dfb554ff2dfd7341da354b3874f5e370c69c9f51d931248b53df3f82f1c43274e23a09f681b6660c7ba48b945d593046aae628f0afc"

RPROVIDES:${PN} += "clash \
clash-meta \
config-mihomo \
mihomo"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
libc.so.6"

inherit rpm
