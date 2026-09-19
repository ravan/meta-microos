SUMMARY = "IP subnet calculator"
DESCRIPTION = "netcalc is an IP network calculator that can calcuate host IP ranges, subnet \
masks, and split networks. It is a clone of sipcalc and uses the output format \
of ipcalc."
LICENSE = "BSD-3-Clause"

PV = "2.1.7"

RPM_NAME = "netcalc-2.1.7-1.8.aarch64.rpm"
RPM_HASH = "d1d893a7d6c0b370492f29def20416dc568fc2e76a948bee85ec283b66c1b713be0ef61099aa3e80a41ca87dec78ac27f6497131f8afcb7ed77d191663c13ff8"

RPROVIDES:${PN} += "netcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
