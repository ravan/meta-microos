SUMMARY = "Fast disk usage analyzer with console interface"
DESCRIPTION = "Fast disk usage analyzer with console interface. Gdu is intended \
primarily for SSD disks where it can fully utilize parallel \
processing. HDDs work as well, but the performance gain is not so \
huge."
LICENSE = "MIT"

PV = "5.36.1"

RPM_NAME = "gdu-5.36.1-1.1.aarch64.rpm"
RPM_HASH = "58fa5b7ff01fa974d67f7e4a220869b5c04696ee3acf4a4c97e188967aa2e68a974c13a0ccd91491551673bfb4d1d0a546c10c0d9bb6552e526aaa973300c590"

RPROVIDES:${PN} += "gdu"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
