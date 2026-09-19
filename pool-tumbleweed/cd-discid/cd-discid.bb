SUMMARY = "Utility to get CDDB discid information"
DESCRIPTION = "cd-discid is a backend utility to get CDDB discid information for a \
CD-ROM disc.  It was originally designed for cdgrab (now abcde), but \
can be used for any purpose requiring CDDB data."
LICENSE = "GPL-2.0+"

PV = "1.4"

RPM_NAME = "cd-discid-1.4-1.36.aarch64.rpm"
RPM_HASH = "92c018844ffa655653b8fb37d7df7b85b4bf21f2284a560c62ac74da051d3bbe6a0b2e3a41eb758c40035ed0c32e7d29d23029695cc94c5b11a0b865bcba6471"

RPROVIDES:${PN} += "cd-discid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
