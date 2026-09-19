SUMMARY = "Micro DHCP client / server"
DESCRIPTION = "Udhcp is a small dhcp client / server mainly used to support Xen \
para-virtualized PXE booting."
LICENSE = "GPL-2.0-only"

PV = "0.9.8"

RPM_NAME = "udhcp-0.9.8-30.9.aarch64.rpm"
RPM_HASH = "c8dcafc3c5ed9bf4dc04f9417d131d4d79393d1678341a8503daf0f403a8605522cb9042e850d03812a22a1b4af7a72e3bca570f61099fd5d936c0e224496382"

RPROVIDES:${PN} += "udhcp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
