SUMMARY = "Wireless daemon for Linux"
DESCRIPTION = "The iNet Wireless Daemon (iwd) project provides a wireless \
connectivity solution. It attempts to optimise resource utilisation \
of storage, runtime memory and link-time costs. It utilises the \
features provided by the Linux kernel."
LICENSE = "LGPL-2.1-or-later"

PV = "3.12"

RPM_NAME = "iwd-3.12-2.1.aarch64.rpm"
RPM_HASH = "414e5d57f9d6e5b9a02325bcc6fecfcaec247f5161f69abe90b12bd36619ab376292d34e31cbfd0b61f1050e72187ce0b498451b294ac7b76dd4801e3c8e0d58"

RPROVIDES:${PN} += "iwd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libell.so.0 \
libreadline.so.8"

inherit rpm
