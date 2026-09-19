SUMMARY = "Tools for Prism2 cards"
DESCRIPTION = "This package contains various tools for configuring Prism2 cards driven \
by the HostAP kernel module. In particular, it contains a utility to \
query and flash firmware of Prism2 adapters."
LICENSE = "GPL-2.0+"

PV = "0.4.7"

RPM_NAME = "hostap-utils-0.4.7-205.9.aarch64.rpm"
RPM_HASH = "0c8976df4f09f0d17d8f9a4db1409e599815d9fa68a3e68123e8e9d717a9340bbcfb98b83a6cef8fd02f8505e6517eedaf2da173e9c48000335fd7caa1ba1214"

RPROVIDES:${PN} += "hostap-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
