SUMMARY = "Parity Archive File Generator"
DESCRIPTION = "Parchive creates extra parity data over several volumes. These can be \
used to restore the complete archive after some data loss or \
corruption."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "par-1.1-192.3.aarch64.rpm"
RPM_HASH = "9c47b9f03e855083c89c29ac5507a6be189a6093ab9b73be811d752febd627a44744038dce67ac45e6e8ebb86a3ade37e5d6ec526c855a4064451a3d785271ea"

RPROVIDES:${PN} += "par"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
