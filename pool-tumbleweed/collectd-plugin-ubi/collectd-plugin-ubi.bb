SUMMARY = "UBIFS plugin for collectd"
DESCRIPTION = "Optional collectd plugin for reporting block state of flash memory devices with UBIFS filesystem."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-ubi-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "773d042237c3e6608e51874af1612efb5c6657695377de481a83fa717073c284bd59d5babe98b045581b37e7c82b6691a095182dbe3233b87f40e9e5f304f056"

RPROVIDES:${PN} += "collectd-plugin-ubi"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
