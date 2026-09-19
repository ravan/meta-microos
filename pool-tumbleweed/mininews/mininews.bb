SUMMARY = "Inews - Post News from an NNTP Client"
DESCRIPTION = "Rich Salz's InterNetNews news transport system."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "mininews-2.6.5-4.2.aarch64.rpm"
RPM_HASH = "360441f786ae42c3fe5f6585d579c306bad4a5612365da6424c67109cbf05dc1d045ac3cda8d346b8a5ef0fe0c40a42323d606c804f65f68d5b4a95b05d28bf4"

RPROVIDES:${PN} += "config-mininews \
mininews \
nntp-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
group-news \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions \
user-news"

inherit rpm
